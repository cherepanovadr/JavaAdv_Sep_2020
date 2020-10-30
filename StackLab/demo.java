package StackLab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        //   stack VS queue
        //   push()   offer()
        //   pop()    poll()
        //        peek()
        //     size() isEmpty()



        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayDeque<String> history = new ArrayDeque<>();
        String current = "";
        while (!input.equals("Home")) {
            if (input.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                    input = scanner.nextLine();
                    continue;
                } else {
                    current = history.pop();
                }
            } else {
                if (!current.equals("")) {
                    history.push(current);
                }
                current = input;
            }
            System.out.println(current);

            input = scanner.nextLine();
        }


    }


}

