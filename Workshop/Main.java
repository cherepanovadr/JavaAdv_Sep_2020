package Workshop;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        LinkedList linkedList = new LinkedList();

        int[] firstArr = linkedList.toArray();

        for (int i = 0; i < 4; i++) {
            linkedList.addLast(i + 1);
        }


        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());
        System.out.println(linkedList.removeLast());

        linkedList.forEach(System.out::println);


//        SmartArray smartArray = new SmartArray();
//        smartArray.add(11);
//        smartArray.add(12);
//        smartArray.add(13);
//        smartArray.add(14);
//        smartArray.add(15);
//        smartArray.remove(1);
//        int getMethod = smartArray.get(1);
//        boolean contains = smartArray.contains(15);
//        int size = smartArray.size();
//        boolean empty = smartArray.isEmpty();
//        smartArray.add(2,66);
//        smartArray.forEach(e-> System.out.println(e));
        System.out.println();


    }
}