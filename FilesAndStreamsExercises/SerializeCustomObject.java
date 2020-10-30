package FilesAndStreamsExercises;

import java.io.*;

public class SerializeCustomObject {
    public static class Course implements Serializable {
        private String name;
        private int studentsNum;

        public Course(String name, int studentsNum) {
            this.name = name;
            this.studentsNum = studentsNum;
        }

    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Course course = new Course("Bulgarian", 10);
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.ser"));
        out.writeObject(course);
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.ser"));
        Course restored = (Course)in.readObject();
        System.out.println(restored.name);
        System.out.println(restored.studentsNum);


    }
}
