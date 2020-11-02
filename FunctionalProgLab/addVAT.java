package FunctionalProgLab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class addVAT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UnaryOperator<Double> vatAdder = priceWithoutVat -> priceWithoutVat * 01.20;
        System.out.println("Prices with VAT:");
        Arrays.stream(scanner.nextLine()
                .split(", "))
                .mapToDouble(e -> vatAdder.apply(Double.parseDouble(e)))
                .forEach(e -> System.out.println(String.format("%.2f", e)));

    }

    ;
}