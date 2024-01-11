package data_sturctures.arrays;

import java.util.Scanner;



public class XDProgression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = x;
            x += d;
        }
        for (int item : array) {
            System.out.print(item + " ");
        }
    }
}
