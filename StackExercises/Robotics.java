package StackExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class Robotics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(";");
        String[] robots = new String[tokens.length];
        int[] processTime = new int[tokens.length];
        int[] currentRobotTime = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            String[] input = tokens[i].split("-");
            robots[i] = input[0];
            processTime[i] = Integer.parseInt(input[1]);
            currentRobotTime[i] = 0;
        }
        int[] inputIime = Arrays.stream(scanner.nextLine().split(":"))
                .mapToInt(Integer::parseInt).toArray();
        int time = inputIime[0] * 3600 + inputIime[1] * 60 + inputIime[2];
        ArrayDeque<String> products = new ArrayDeque<>();
        String product = "";
        while (!(product = scanner.nextLine()).equals("End")) {
            products.offer(product);
        }
        while (!products.isEmpty()) {
            for (int i = 0; i < robots.length; i++) {
                if (currentRobotTime[i] > 0) {
                    currentRobotTime[i]--;
                }
            }
            time++;
            String currentItem = products.poll();
            boolean isTaken = false;
            for (int i = 0; i < robots.length; i++) {
                if (currentRobotTime[i] == 0) {
                    System.out.printf("%s - %s [%s]%n", robots[i], currentItem, getTime(time));
                    currentRobotTime[i] = processTime[i];
                    isTaken = true;
                    break;
                }
            }
            if (!isTaken) {
                products.offer(currentItem);
            }
        }
    }

    private static String getTime(int time) {
        int hours = time / 3600 % 24;
        int mins = time / 60 % 60;
        int secs = time % 60;
        return String.format("%02d:%02d:%02d", hours, mins, secs);
    }
}
