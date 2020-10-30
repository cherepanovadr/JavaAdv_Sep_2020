package FilesAndStreamsLab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String path = "D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\" +
                "04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        FileInputStream inputStream = new FileInputStream(path);  //scanner will take stream (potok) from it
        Scanner scanner = new Scanner(inputStream);
        String table = ",.!?";
        FileOutputStream outputStream = new FileOutputStream("D:\\Downloads\\output.txt");
        while (scanner.hasNext()) {
            String line = scanner.nextLine();
            for (int i = 0; i < line.length(); i++) {
                char symbol = line.charAt(i);
                if (!table.contains(String.valueOf(symbol))) {
                    outputStream.write(symbol);

                }

            }
            outputStream.write('\n');
        }
        inputStream.close();
        outputStream.flush();
    }
}
