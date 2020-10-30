package StackExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] nsx = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int n = nsx[0]; //to push onto stack
        int s = nsx[1]; //pop from from stack
        int x = nsx[2]; //present
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int smallest = Integer.MAX_VALUE;
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            nums.push(numbers[i]);
        }

        for (int i = 0; i < s; i++) {
            nums.pop();
        }
        if (nums.isEmpty()) {
            System.out.println(0);
        } else if (nums.contains(x)) {
            System.out.println(true);
        } else {

            System.out.println(Collections.min(nums));
        }

    }
}
