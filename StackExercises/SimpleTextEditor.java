package StackExercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleTextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        ArrayDeque<String> stack = new ArrayDeque<>();
        StringBuilder text = new StringBuilder();
        for (int i = 0; i < a; i++) {
            String[] command = scanner.nextLine().split("\\s+");
            String operation = command[0];
            String commandArgument = "";
            if (command.length > 1) {
                commandArgument = command[1];
            }
            switch (operation) {
                case "1":
                    stack.push(text.toString());
                    text.append(commandArgument);
                    break;
                case "2":
                    stack.push(text.toString());

                    int count = Integer.parseInt(commandArgument);
                    int endIndex = text.length();
                    int startIndex = endIndex - count;
                    text.delete(startIndex, endIndex);

                    break;
                case "3":
                    int index = Integer.parseInt(commandArgument) - 1;
                    if (index >= 0 && index < text.length()) {
                        char current = text.charAt(index);
                        System.out.println(current);
                    }
                    break;
                case "4":
                    if (!stack.isEmpty()) {
                        text.setLength(0);
                        text.append(stack.pop());

                        break;
                    }


            }


        }
    }}
