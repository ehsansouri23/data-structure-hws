package restaurant;

import java.util.Scanner;

public class Restaurant {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size;
        size = Integer.parseInt(s.nextLine());
        BST tree = new BST();
        int j = 0;
        for (int i = 0; i < size; i++) {
            if (s.nextLong() == 1) {
                long t = s.nextLong();
                tree.insertData(t);
                j++;
            } else {
                if (j < 3)
                    System.out.println("No reviews yet");
                else
                    System.out.println(tree.getMin(j - (j / 3) + 1));
            }
        }
    }
}

