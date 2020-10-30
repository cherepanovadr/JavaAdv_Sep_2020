package SetsAndMapsExercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Character, Integer> symbols = new TreeMap<>();
        String text = scanner.nextLine();
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            if (!symbols.containsKey(current)) {
                symbols.put(current, 1);
            } else {
                int currentCount= symbols.get(current);
                symbols.put(current,++currentCount);
            }

        }
        for (Map.Entry<Character, Integer> entry : symbols.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(),entry.getValue());
        }

    }
}
