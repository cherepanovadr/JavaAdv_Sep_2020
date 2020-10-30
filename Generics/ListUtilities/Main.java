package Generics.ListUtilities;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(8, 24, 56, 7, 8);
        System.out.println(ListUtils.getMin(numbers));
        System.out.println(ListUtils.getMax(numbers));
    }
}
