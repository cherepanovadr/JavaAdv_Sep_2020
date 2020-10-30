package FilesAndStreamsLab;

import java.io.*;
import java.util.List;

public class Serialization {
    public static class Goat implements Serializable {
        private String name;
        private int age;

        public Goat(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Goat goat = new Goat("fenya", 7);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.txt"));
        out.writeObject(goat);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.txt"));
        Goat restoredGoat = (Goat)in.readObject();
        System.out.println(restoredGoat.age);
        System.out.println(restoredGoat.name);

    }
}
