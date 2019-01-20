package restaurant;

public class BST {

    private Node root;

    public BST() {
        root = null;
    }

    public void insertData(long data) {
        Node pTraverse = root;
        Node currentParent = root;

        while (pTraverse != null) {
            currentParent = pTraverse;
            if (data < pTraverse.getData()) {
                pTraverse.setlCount(pTraverse.getlCount() + 1);
                pTraverse = pTraverse.getLeft();
            } else {
                pTraverse = pTraverse.getRight();
            }
        }
        if (root == null)
            root = new Node(data);
        else if (data < currentParent.getData()) {
            Node node = new Node(data);
            currentParent.setLeft(node);
        } else {
            Node node = new Node(data);
            currentParent.setRight(node);
        }
    }

    public long getMin(long l) {
        long res = -1;
        long kk = l;
        Node pTraverse = root;
        while (pTraverse != null) {
            if (pTraverse.getlCount() + 1 == kk) {
                res = pTraverse.getData();
                break;
            } else if (kk > pTraverse.getlCount()) {
                kk -= (pTraverse.getlCount() + 1);
                pTraverse = pTraverse.getRight();
            } else {
                pTraverse = pTraverse.getLeft();
            }
        }
        return res;
    }
}
