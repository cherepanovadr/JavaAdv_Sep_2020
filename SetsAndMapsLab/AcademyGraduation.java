package SetsAndMapsLab;

import java.text.DecimalFormat;
import java.util.*;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Map<String, Double[]> graduation = new TreeMap<>();

        while (a-- > 0) {
            String name = scanner.nextLine();
            String[] score = scanner.nextLine().split("\\s+");
            Double[] scores = new Double[score.length];
            for (int i = 0; i < score.length; i++) {
                scores[i] = Double.parseDouble(score[i]);
            }
            graduation.putIfAbsent(name, scores);
        }
        for (Map.Entry<String, Double[]> entry : graduation.entrySet()) {
            System.out.println(String.format("%s is graduated with %s", entry.getKey(), avgScore(entry.getValue())));
        }
    }

    private static String avgScore(Double[] value) {
        double current = 0.00;
        for (Double aDouble : value) {
            current+=aDouble;
        }
        current= current/value.length;
        DecimalFormat format = new DecimalFormat("0.##################");
        return format.format(current);
    }
}


//DecimalFormat format = new DecimalFormat("0.###");
//System.out.println(format.format(price));