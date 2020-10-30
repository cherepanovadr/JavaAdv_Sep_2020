package SetsAndMapsExercises;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        Set<String> set = new LinkedHashSet<>();
        while (a-->0){
            String name = scanner.nextLine();
            set.add(name);
        }
        for (String s : set) {
            System.out.println(s);

        }
       // set.forEach(System.out :: println);



    }
}
