package GenericsExercises.GenericSwapMethodStrings;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        SwapBox<Integer> swapBox = new SwapBox();
        while (a-- >0){
            int number = Integer.parseInt(scanner.nextLine());
            swapBox.add(number);
        }
        String[] tokens = scanner.nextLine().split("\\s+");
        int first = Integer.parseInt(tokens[0]);
        int second = Integer.parseInt(tokens[1]);
        swapBox.swap(first,second);
        System.out.println(swapBox);

    }
}
