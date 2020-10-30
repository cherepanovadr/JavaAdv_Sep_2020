package SetsAndMapsLab;

import java.util.*;
import java.util.stream.Collectors;

public class AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<Double>> scores = new TreeMap<>();


        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double score = Double.parseDouble(input[1]);
            scores.putIfAbsent(name, new ArrayList<>());
            scores.get(name).add(score);

        }
        for (Map.Entry<String, List<Double>> entry : scores.entrySet()) {
            System.out.println(String.format("%s -> %s (avg: %.2f)", entry.getKey(), getAsString(entry.getValue()), avgScore(entry.getValue())));
        }
    }

    private static Double avgScore(List<Double> value) {   // with stream API the rpundong is getting error for 8th check sot better to make the method on hand
        double output = 0.0;
        for (Double aDouble : value) {
            output += aDouble;
        }
        output = output / value.size();
        return output;
    }

    private static String getAsString(List<Double> value) {
        return value.stream()
                .map(grade -> String.format("%.2f", grade))
                .collect(Collectors.joining(" "));
    }
}
