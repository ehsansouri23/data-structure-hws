package restaurant;

public class Node {

    private long data;
    private long lCount;
    private long rCount;
    private Node left;
    private Node right;

    public Node() {
        lCount = 0;
        rCount = 0;
        left = null;
        right = null;
    }

    public Node(long data) {
        this.data = data;
        lCount = 0;
        left = null;
        right = null;
    }

    public long getData() {
        return data;
    }

    public long getlCount() {
        return lCount;
    }

    public long getrCount() {
        return rCount;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(long data) {
        this.data = data;
    }

    public void setlCount(long lCount) {
        this.lCount = lCount;
    }

    public void setrCount(long rCount) {
        this.rCount = rCount;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
