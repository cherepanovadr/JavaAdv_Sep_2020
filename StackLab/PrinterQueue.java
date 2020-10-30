package StackLab;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Deque<String> queue = new ArrayDeque<>();
        while(!"print".equals(input)){
            if(input.equals("cancel")){
                if(queue.size()>0){
                    System.out.println("Canceled " + queue.poll());
                } else{
                    System.out.println("Printer is on standby");
                }


            } else{
                queue.offer(input);


            }


input = scanner.nextLine();
        }
        for (String s : queue) {
            System.out.println(s);

        }

    }
}
