package data_sturctures.arrays;

import java.util.Scanner;

public class FillWithN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = n;
            n--;
        }

        for (int item: array) {
            System.out.print(item + " ");
        }
    }
}
