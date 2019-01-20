package election;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        MinHeap minHeap = new MinHeap(size);
        for (long i = 0; i < size; i++) {
            long t = s.nextLong();
            minHeap.insert(t);
        }
        long r = 0, u, v;
        for (int l = 0; l < size; l++) {
            u = minHeap.getMin();
            if (l == size - 1)
                v = 0;
            else
                v = minHeap.getMin();
            r += u + v;
            minHeap.insert(u + v);
        }
        System.out.println(r);
    }
}

