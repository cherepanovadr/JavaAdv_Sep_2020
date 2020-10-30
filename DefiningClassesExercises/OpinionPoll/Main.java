package DefiningClassesExercises.OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        List<Person> people = new ArrayList<>();
        while (a-- > 0) {
            String[] token = scanner.nextLine().split("\\s+");
            String name = token[0];
            int age = Integer.parseInt(token[1]);
            if (age > 30) {
                Person person = new Person(name, age);
                people.add(person);
            }
        }
        people.sort(Comparator.comparing(p -> p.getName()));
        for (Person person : people) {
            System.out.println(person.toString());

        }
    }
}
