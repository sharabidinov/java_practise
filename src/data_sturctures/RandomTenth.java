package data_sturctures;

import java.util.Scanner;

public class RandomTenth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int[] array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
        }

        int counter = 0;
        for (int item : array) {
            if (item / 10 % 2 == 0) {
                counter++;
            }
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(counter);
    }
}
