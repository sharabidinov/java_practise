package data_sturctures.arrays;

import java.util.*;

public class RandomPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            numbers.add(i);
        }

        Collections.shuffle(numbers);

        int index = numbers.indexOf(5);
        if (index != 0) {
            Collections.swap(numbers, 0, index);
        }

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

