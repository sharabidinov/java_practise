package data_sturctures.arrays;

import java.util.Scanner;

public class MeanCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        double mean;
        int sum = 0;
        sc.close();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
            sum += array[i];
        }

        for (int item : array) {
            System.out.print(item + " ");
        }

        mean = (double) sum / array.length;
        System.out.println();
        System.out.println(mean);
    }
}
