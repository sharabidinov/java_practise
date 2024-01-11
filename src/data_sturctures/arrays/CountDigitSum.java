package data_sturctures.arrays;

import java.util.Scanner;

public class CountDigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
        }
        int counter = 0;

        for (int item : array) {
            int sum = 0;
            System.out.print(item + " ");
            while (item != 0) {
                sum += item % 10;
                item /= 10;
            }
            if (sum == k) {
                counter++;
            }
        }
        System.out.println();
        System.out.println(counter);

    }
}
