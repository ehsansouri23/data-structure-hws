package election;

public class MinHeap {

    private long[] array;
    private long size;
    private int numbersIn;

    public MinHeap(int size) {
        array = new long[size];
        this.size = size;
        numbersIn = 0;
    }

    public void insert(long in) {
        numbersIn++;
        int i = numbersIn - 1;
        array[i] = in;
        while (i != 0 && array[(i - 1) / 2] > array[i]) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    long getMin() {
        long r = array[0];
        array[0] = array[numbersIn - 1];
        numbersIn--;
        size--;
        minHeapify(0);
        return r;
    }

    private void minHeapify(int i) {
        int right = 2 * i + 2;
        int left = 2 * i + 1;
        int smallest = i;
        if (left < numbersIn && array[left] < array[i])
            smallest = left;
        if (right < numbersIn && array[right] < array[smallest])
            smallest = right;
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }

    public void swap(int x, int y) {
        long temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

    public long[] getArray() {
        return array;
    }

    public void setArray(long[] array) {
        this.array = array;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public int getNumbersIn() {
        return numbersIn;
    }

    public void setNumbersIn(int numbersIn) {
        this.numbersIn = numbersIn;
    }
}
