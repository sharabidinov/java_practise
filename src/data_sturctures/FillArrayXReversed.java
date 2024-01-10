package data_sturctures;


import java.util.Scanner;


public class FillArrayXReversed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            --n;
            array[i] = x + n;
        }

        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
