package FunctionalProgLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Function<int[], String> getCount = array -> String.format("Count = %d", array.length);
        System.out.println(getCount.apply(arr));



        Function<int[],String> getSum = array -> String.format("Sum = %d", Arrays.stream(array).sum());
        System.out.println(getSum.apply(arr));


    }
}
