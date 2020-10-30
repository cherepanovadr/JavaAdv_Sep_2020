package FilesAndStreamsExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {
        Path firstFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt");
        Path secondFile = Path.of("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt");
        List<String> lines = Files.readAllLines(firstFile);
        Map<String, Integer> wordsCount = new LinkedHashMap<>();

        List<String> searchedLines = Files.readAllLines(secondFile);
        for (String line : lines) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                word.replaceAll(",", "");
                wordsCount.put(word, 0);
            }
        }
        for (String line : searchedLines) {
            Arrays.stream(line.split("\\s+")).forEach(
                    word -> {
                        if (wordsCount.containsKey(word)) {
                            wordsCount.put(word, wordsCount.get(word) + 1);
                        }
                    }
            );
        }

        PrintWriter writer = new PrintWriter("results.txt");
        wordsCount.entrySet()
                .stream()
                .forEach(e -> writer.println(String.format("%s - %d", e.getKey(), e.getValue()))
                );

        writer.close();
    }
}
