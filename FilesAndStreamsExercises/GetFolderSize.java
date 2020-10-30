package FilesAndStreamsExercises;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String folderPath = "D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";
        File file = new File(folderPath);
        File[] files = file.listFiles();
        long folderSize = 0;
        if (file.listFiles() != null) {
            for (File file1 : files) {
                folderSize += file1.length();
            }
            System.out.println("Folder size: " + folderSize);
        }

    }
}
