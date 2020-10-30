package SetsAndMapsExercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> miner = new LinkedHashMap<>();
        int count = 0;
        String inputPrev = "";
        String input = scanner.nextLine(); //GOld,155
        while (!input.equals("stop")) {
            if (count % 2 == 0) {
                miner.putIfAbsent(input, 0);
            } else {

                miner.put(inputPrev, miner.get(inputPrev)+Integer.parseInt(input));
            }

            count++;
            inputPrev = input;
            input = scanner.nextLine();
        }
        miner.entrySet()
                .stream()
                .forEach(e -> System.out.println(String.format("%s -> %d", e.getKey(), e.getValue())));


    }
}
