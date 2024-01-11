package data_sturctures.arrays;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        array[0] = 1;
        array[1] = 1;
        sc.close();

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i -1] + array[i-2];
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
