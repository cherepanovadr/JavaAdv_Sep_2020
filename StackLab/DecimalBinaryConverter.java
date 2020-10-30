package StackLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DecimalBinaryConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Deque<Integer> stack = new ArrayDeque<>();
        int input = Integer.parseInt(scanner.nextLine());
        if(input==0){
            System.out.println(0);
        }
        while (input > 0) {
            stack.push(input % 2);
            input = input / 2;
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            System.out.print(stack.pop());

        }


    }
}
