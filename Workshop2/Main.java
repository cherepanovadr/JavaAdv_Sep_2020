package Workshop2;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 4; i++) {
            linkedList.addFirst(i+1);

        }
        linkedList.forEach(System.out::println);
        int[] array = linkedList.toArray();
        for (int i : array) {
            System.out.println(i);

        }
    }
}
