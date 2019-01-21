package tree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        Tree g = new Tree(size);
        for (int i = 1; i < size; i++) {
            g.addEdge(s.nextInt() - 1, s.nextInt() - 1);
        }
        System.out.println(g.longestPathLength());
    }
}
