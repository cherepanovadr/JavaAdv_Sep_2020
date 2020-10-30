package StackLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = input.length - 1; i >= 0; i--) {
            stack.push(input[i]);
        }
        int current = 0;
        while (stack.size() > 1) {
            int first = Integer.parseInt(stack.pop());
            char operator = (stack.pop()).charAt(0);
            int second = Integer.parseInt(stack.pop());
            if (operator == '+') {
                current = first + second;
            } else {
                current = first - second;
            }
            stack.push(current+"");
        }
        System.out.println(stack.pop());


    }
}
