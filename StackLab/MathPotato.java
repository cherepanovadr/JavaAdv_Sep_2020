package StackLab;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        ArrayDeque<String> queKids = new ArrayDeque<>();
        String[] children = scr.nextLine().split("\\s+");
        int n = Integer.parseInt(scr.nextLine());
        for (String child : children) {
            queKids.offer(child);
        }
        int count = 1;


        while (queKids.size() > 1) {
            for (int i = 1; i < n; i++) {
                queKids.offer(queKids.remove());
            }
            if (isPrime(count)) {
                System.out.println("Prime " + queKids.peek());
            } else {
                System.out.println("Removed " + queKids.poll());
            }
            count++;
        }
        String lastName = queKids.poll();
        System.out.println("Last is " + lastName);

    }

    private static boolean isPrime(int count) {
        boolean result = true;
        if (count == 0 || count == 1) {
            result = false;
        } else {
            for (int i = 2; i <= Math.sqrt(count); i++) {
                if (count % i == 0) {
                    result = false;
                }
            }
        }
        return result;
    }
}

