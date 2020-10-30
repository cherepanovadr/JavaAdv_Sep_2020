package SetsAndMapsLab;

import com.sun.tools.javac.Main;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lineSeparator = System.lineSeparator();

        Set<String> names =new TreeSet<>();
        names.add("Pesho");
        names.add("Gosho");
        names.add("Pesho");

        for (String name : names) {
            System.out.println(name);

        }
        System.out.println("Pesho".hashCode());
        System.out.println("Gosho".hashCode());
        System.out.println();


        Main main = new Main();
        int i = main.hashCode();

    }
}
