package data_sturctures.arrays;

import java.util.Scanner;

public class EvenOddCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        int[] array = new int[n];
        int evenCounter = 0;
        int oddCounter = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
            if (array[i] % 2 == 0) {
                evenCounter++;
            } else {
                oddCounter++;
            }
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
        System.out.println(evenCounter + " " + oddCounter);
    }
}
