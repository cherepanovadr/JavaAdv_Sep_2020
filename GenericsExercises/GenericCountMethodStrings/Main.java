package GenericsExercises.GenericCountMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Box<Double> box = new Box<>();
        while (a-- > 0) {
            Double text = Double.parseDouble(scanner.nextLine());
            box.add(text);
        }
        Double element =Double.parseDouble( scanner.nextLine());
        int countGreater = box.countGreaterThan(element);
        System.out.println(countGreater);

    }
}
