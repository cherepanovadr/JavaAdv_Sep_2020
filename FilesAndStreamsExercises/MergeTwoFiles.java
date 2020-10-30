package FilesAndStreamsExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        Path pathFirst = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt");
        Path pathSecond = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt");
        List<String> linesFirst = Files.readAllLines(pathFirst);
        List<String> linesSecond = Files.readAllLines(pathSecond);


        PrintWriter writer = new PrintWriter("merge.txt");

        linesFirst.forEach(writer::println);
        linesSecond.forEach(writer::println);
        writer.close();
    }
}
