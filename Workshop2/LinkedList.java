package Workshop2;

import java.util.function.Consumer;

// int[] or Node with int as data ...
public class LinkedList {
    private Node head;
    private int size;

    public LinkedList() {
    }

    private static class Node {
        private int element;
        private Node next;

        private Node(int element) {
            this.element = element;
        }
    }

    public int get(int index) {
        validateIndex(index);
        Node current = this.head;
        int currentIndex = 0;
        int result = 0;
        while (current != null) {
            if (currentIndex == index) {
                result = current.element;
                break;
            }
            currentIndex++;
            current = current.next;
        }
        return result;
    }

    public int removeFirst() {
        if (this.head == null) {
            throw new IllegalStateException("Can't remove first from empty LinkedList");
        }
        int result = this.head.element;
        this.head = this.head.next;
        this.size--;
        return result;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= this.size()) {
            throw new IllegalArgumentException("Index" + index + " was out of structure bound!");
        }
    }

    public void forEach(Consumer<Integer> consumer) {
        Node current = this.head;
        while (current != null) {
            consumer.accept(current.element);
            current = current.next;
        }

    }

    public void addFirst(int element) {
        Node newNode = new Node(element);
        if (this.head != null) {
            newNode.next = this.head;
        }
        this.head = newNode;
        this.size++;
    }

    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int[] toArray() {
        int[] arr = new int[this.size];
        Node current = this.head;
        int index = 0;
        while (current!= null){
            arr[index++] = current.element;
            current = current.next;
        }
        return arr;
    }

}
