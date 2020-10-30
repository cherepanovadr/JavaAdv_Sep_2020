package FilesAndStreamsExercises;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources\\inputLineNumbers.txt");
        List<String> lines = Files.readAllLines(pathFile);
        PrintWriter writer = new PrintWriter("outputLineNumbers.txt");

        int count = 1;
        for (int i = 0; i < lines.size(); i++) {
            writer.println(count++ + ". " + lines.get(i));
        }
        writer.close();


    }
}
