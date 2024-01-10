package data_sturctures;


import java.util.Scanner;

public class TwoPowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0) {
            System.out.print((int) Math.pow(2, n) + " ");
            n--;
        }
    }
}
