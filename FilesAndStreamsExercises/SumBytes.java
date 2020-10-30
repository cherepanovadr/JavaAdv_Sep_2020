package FilesAndStreamsExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class SumBytes {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        byte[] values = Files.readAllBytes(pathFile);
        long sum = 0;
        for (byte line : values) {
            if (line == 10 || line == 13) {
                continue;
            }
            sum += line;

        }
        System.out.println(sum);
    }
}
