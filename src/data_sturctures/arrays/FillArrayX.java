package data_sturctures.arrays;

import java.util.Scanner;

public class FillArrayX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] array = new int[x];

        for (int i=0; i < array.length; i++) {
            array[i] = n;
            n++;
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
