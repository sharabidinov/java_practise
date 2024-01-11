package data_sturctures.arrays;

import java.util.Random;
import java.util.Scanner;

public class GroupMeanCalculation {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        int sum = 0;
//        int counter = 0;
//        int sum2 = 0;
//        int counter2 = 0;
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int) (Math.random() * ((b + 1) - a)) + a;
//            if (array[i] < 50) {
//                sum += array[i];
//                counter++;
//            } else {
//                sum2 += array[i];
//                counter2++;
//            }
//            System.out.print(array[i] + " ");
//        }
//
//        System.out.println();
//        if (counter > 0) {
//            if (counter2 > 0) {
//                System.out.println((double) sum / counter);
//                System.out.println((double) sum2 / counter2);
//            } else if (counter2 <= 0) {
//                System.out.println((double) sum / counter);
//                System.out.println(0);
//            }
//        } else {
//        }
//    }
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Ввод границ диапазона и размера массива
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int N = scanner.nextInt();

    // Создание массива и заполнение случайными числами
    int[] array = new int[N];
    Random random = new Random();
    for (int i = 0; i < N; i++) {
        array[i] = random.nextInt(B - A + 1) + A;
    }

    // Вывод массива
    for (int i = 0; i < N; i++) {
        System.out.print(array[i] + " ");
    }
    System.out.println();

    // Вычисление среднего арифметического для элементов < 50 и >= 50
    double sumBelow50 = 0;
    int countBelow50 = 0;
    double sumAbove50 = 0;
    int countAbove50 = 0;

    for (int i = 0; i < N; i++) {
        if (array[i] < 50) {
            sumBelow50 += array[i];
            countBelow50++;
        } else {
            sumAbove50 += array[i];
            countAbove50++;
        }
    }

    // Вывод средних арифметических
    double avgBelow50 = countBelow50 > 0 ? sumBelow50 / countBelow50 : 0;
    double avgAbove50 = countAbove50 > 0 ? sumAbove50 / countAbove50 : 0;

    System.out.printf("%.3f %.3f\n", avgBelow50, avgAbove50);
}
}
