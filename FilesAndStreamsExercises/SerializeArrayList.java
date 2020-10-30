package FilesAndStreamsExercises;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SerializeArrayList {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List<Double> nums = new ArrayList<>();
        nums.add(13.0);
        nums.add(5.6);
        nums.add(2.2);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("list.ser"));
        out.writeObject(nums);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("list.ser"));
        List<Double> readList = (List<Double>) in.readObject();
        for (Double aDouble : readList) {
            System.out.println(aDouble);

        }

    }
}
