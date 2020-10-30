package StackExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> numbers = new ArrayDeque<>();
        int[] input = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer :: parseInt)
                .toArray();
        for (int s : input) {
            numbers.push(s);
        }

        while (!numbers.isEmpty()) {
            System.out.print(numbers.pop() + " ");
        }

    }

    public static class RecursiveFibonacci {
        private static long[] memory;

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int n = Integer.parseInt(scanner.nextLine());
    //fibonacci(n) = fibonacci(n-1)+fibonacci(n-2)

            memory = new long[n + 1];
            long result = fibonacci(n);
            System.out.println(result);


        }

        private static long fibonacci(int n) {
            if (n <= 1) {
                return 1;
            }
            if (memory[n] != 0) {
                return memory[n];
            }
            return memory[n]=fibonacci(n - 2) + fibonacci(n - 1);

        }
    }
}

