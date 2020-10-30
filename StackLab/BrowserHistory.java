package StackLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //read input
        // if not back or home then push to stack
        //sout
        String output = "";
        Deque<String> stack = new ArrayDeque<>();
        String input = scanner.nextLine();
        while (true) {
                switch (input) {
                case "back":
                    if (stack.size() <= 1) {
                        output = "no previous URLs";
                    } else {
                        stack.pop();
                        output = stack.peek();
                    }
                    break;
                case "Home":
                    return;
                default:
                    output = input;
                    stack.push(input);

            }


            System.out.println(output);
            input=scanner.nextLine();

        }
    }
}
