package StackLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(15);
        stack.push(18);
        stack.push(33);
        int size = stack.size();
        System.out.println(size);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        int size2 = stack.size();
        System.out.println(size2);
        boolean isEmpty = stack.isEmpty();
        System.out.println(isEmpty);
        System.out.println(stack.contains(15));
    }
}
