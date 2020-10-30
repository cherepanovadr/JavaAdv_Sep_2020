package ExamPrep;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FlowerWreaths {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wreath = 0;
        int stored = 0;

        ArrayDeque<Integer> sLilies = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .forEach(sLilies::push);    // create stack pop  push

        ArrayDeque<Integer> qRoses = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new)); // create queue remove offer
        while (!sLilies.isEmpty() && !qRoses.isEmpty()) {
            int sum = 0;
            int lilies = sLilies.pop();
            int roses = qRoses.peek();
            sum = lilies + roses;
            if (sum == 15) {
                qRoses.remove();
                wreath++;
            } else if (sum > 15) {
                lilies = lilies - 2;
                sLilies.push(lilies);
            } else if (sum < 15) {
                stored += sum;
                qRoses.remove();
            }
        }
        int additional = 0;
        if (stored >= 15) {
            additional = stored / 15;
            wreath += additional;
        }
        if (wreath >= 5) {
            System.out.printf("You made it, you are going to the competition with %d wreaths!", wreath);
        } else {
            System.out.printf("You didn't make it, you need %d wreaths more!", 5 - wreath);
        }
    }
}