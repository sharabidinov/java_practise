package data_sturctures.arrays;

import java.util.Scanner;

public class ConditionalMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
        }

        int currentMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > currentMax && array[i] % 2 == 0) {
                currentMax = array[i];
            }
            System.out.print(array[i] + " ");
        }
        System.out.println();
        if (currentMax > 0) {
            System.out.println(currentMax);
        } else {
            System.out.println(-1);
        }
    }
}
