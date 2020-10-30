package FilesAndStreamsLab;

import java.io.File;
import java.io.IOException;

public class ListFiles {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\Files-and-Streams");

        File[] files = file.listFiles();
        for (File f : files) {
            if (!f.isDirectory()) {
                System.out.println(String.format("%s: [%d]", f.getName(), f.length()));
            }

        }
    }

}
