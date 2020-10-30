package FilesAndStreamsExercises;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ALLCAPITALS {
    public static void main(String[] args) throws IOException {
        Path pathFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt");
        Path outFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        List<String> lines = Files.readAllLines(pathFile);
        File outputFile = new File("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\output.txt");
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        lines.forEach(line -> {
            try {
                writer.write(line.toUpperCase());
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.close();

    }
}

