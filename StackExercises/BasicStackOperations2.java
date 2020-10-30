package StackExercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        ArrayDeque stackNumbers = new ArrayDeque();
        int n = Integer.parseInt(firstLine[0]);
        int s = Integer.parseInt(firstLine[1]);
        int x = Integer.parseInt(firstLine[2]);
        String[] numbers = scanner.nextLine().split("\\s+");
        for (int i = 0; i < n; i++) {
            stackNumbers.push(Integer.parseInt(numbers[i]));
        }
        for (int i = 0; i < s; i++) {
            stackNumbers.pop();
        }


        if(stackNumbers.isEmpty()){
            System.out.println(0);
        }else {


            if (stackNumbers.contains(x)) {
                System.out.println("true");

            } else {
                // System.out.println(stackNumbers.stream().mapToInt(e -> (int) e).min().getAsInt());
                System.out.println(Collections.min(stackNumbers));
            }
        }

    }
}
