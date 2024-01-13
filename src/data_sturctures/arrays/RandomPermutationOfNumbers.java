package data_sturctures.arrays;

import java.util.Scanner;

public class RandomPermutationOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] array = new int[n];
        for (int i = 1; i <= n; i++) {
            int a = 0;
            int randomIndex = (int) (Math.random() * (i - a)) + a;
            array[i - 1] = array[randomIndex];
            array[randomIndex] = i;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
