package FilesAndStreamsLab;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WriteEveryThirdLine {
    public static void main(String[] args) throws IOException {
        //BufferedReader consoleRead = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        Stream<String> lines = reader.lines();
        List<String> stringLines = lines.collect(Collectors.toList());
        BufferedWriter writer = new BufferedWriter(new FileWriter("by-three.txt"));
        for (int i = 0; i < stringLines.size(); i++) {
            if ((i + 1) % 3 == 0) {
                writer.write(stringLines.get(i));
                writer.newLine();

            }
        }
        writer.flush();
    }
}
