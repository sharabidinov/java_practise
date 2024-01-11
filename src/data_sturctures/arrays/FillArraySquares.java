package data_sturctures.arrays;

import java.util.Scanner;

public class FillArraySquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arraySquares = new int[n];
        int counter = 1;
        while (counter <= n) {
            arraySquares[counter-1] = counter * counter;
            counter++;
        }
        for (int item: arraySquares) {
            System.out.print(item + " ");
        }
    }
}
