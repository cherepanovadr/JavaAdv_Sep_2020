package GenericsExercises.GenericBox;

import GenericsExercises.GenericBox.Box;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        //  Box<String> box = new Box();
        Box<Integer> box = new Box();

        while (a-- > 0) {
            //String text = scanner.nextLine();
            int number = Integer.parseInt(scanner.nextLine());
            box.add(number);

        }
        System.out.println(box);


    }
}
