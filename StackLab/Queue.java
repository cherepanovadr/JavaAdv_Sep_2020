package StackLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        int a = Integer.parseInt(scanner.nextLine());
        Deque<String> queue = new ArrayDeque<>(Arrays.asList(input));
        int currentRound = 1;
        while (queue.size() > 1) {
            String currentChild = queue.poll();
            if (currentRound % a != 0) {
                queue.offer(currentChild);
            } else {
                System.out.println("Removed " + currentChild);
            }
            currentRound++;
        }
        System.out.println("Last is " + queue.poll());

    }
}
