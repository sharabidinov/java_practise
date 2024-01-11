package data_sturctures.arrays;

import java.util.Scanner;

public class RandomPermutationOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            int randomIndex = (int) (Math.random() * (n - a)) + a;
            array[randomIndex] = i + 1;
            array[i] = array[randomIndex];
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
