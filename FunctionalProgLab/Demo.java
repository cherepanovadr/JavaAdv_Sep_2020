package FunctionalProgLab;

import java.io.OutputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String[] strings = scanner.nextLine().split(", ");
//        String output = Arrays.stream(strings)
//                .mapToInt(e -> Integer.parseInt(e))
//                .filter(num -> num % 2 == 0)
//                .mapToObj(e -> String.valueOf(e))//Boxed to make string
//                .collect(Collectors.joining(", "));
//        System.out.println(output);
//        output = Arrays.stream(strings)
//                .mapToInt(e -> Integer.parseInt(e))
//                .filter(num -> num % 2 == 0)
//                .sorted()
//                .mapToObj(e -> String.valueOf(e))//Boxed to make string
//                .collect(Collectors.joining(", "));
//        System.out.println(output);


        Function<Integer, Integer> numTOSquare = x -> x * x;
        System.out.println(numTOSquare.apply(4));


    }
}
