package StackLab;

import java.util.PriorityQueue;

public class PriorityQueueTopic {


    public static void main(String[] args) {


        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
        priorityQueue.offer(15);
        priorityQueue.offer(31);
        priorityQueue.offer(21);
        priorityQueue.offer(Integer.MIN_VALUE);
        System.out.println(priorityQueue.poll());

    }
}
