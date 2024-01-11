package data_sturctures.arrays;

import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        int counter = 1;
        while (counter <= n) {
            array[counter-1] = counter;
            counter++;
        }
        for (int item: array) {
            System.out.print(item + " ");
        }
    }
}
