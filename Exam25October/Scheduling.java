package Exam25October;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Scheduling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //tasks
        //threads
        //the integer value of a task that you need to kill.
        //20, 23, 54, 34, 90
        //150 64 20 34
        //54

        ArrayDeque<Integer> sTasks = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(sTasks::push);    // create stack pop  push

        ArrayDeque<Integer> qThreads = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // create queue remove offer
        int a = Integer.parseInt(scanner.nextLine());

        while (!sTasks.isEmpty() && !qThreads.isEmpty()) {
            int task = sTasks.peek();
            int thread = qThreads.peek();

            if (task == a) {
                System.out.println(String.format("Thread with value %d killed task %d", thread, a));
           break;
            }

            if (thread >= task) {
                qThreads.poll();
                sTasks.pop();
            } else {
                qThreads.poll();
            }
        }

        for (Integer qThread : qThreads) {
            System.out.print(qThread+" ");

        }

    }
}
