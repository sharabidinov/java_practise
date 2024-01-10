package data_sturctures;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int[] array = new int[n];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
            if (array[i] > 99 && array[i] < 1000) {
                if (array[i] % 5 != 0) {
                    counter++;
                }
            }
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(counter);

    }
}
