package StackExercises;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        ArrayDeque<String> stuck = new ArrayDeque<>();
        int size = input.length;

        for (String s : input) {
            stuck.push(s);
        }
        for (String s : stuck) {
            System.out.print(stuck.pop()+" ");

        }

        }

    }

