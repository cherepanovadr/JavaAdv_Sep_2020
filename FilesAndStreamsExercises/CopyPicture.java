package FilesAndStreamsExercises;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyPicture {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\chere\\OneDrive\\Desktop\\0.jpeg";
        FileInputStream inputStream = new FileInputStream(path);
        FileOutputStream outputStream = new FileOutputStream("C:\\Users\\chere\\OneDrive\\Desktop\\1.jpeg");
        int nexByte = inputStream.read();
        while (nexByte != -1) {
            outputStream.write(nexByte);


            nexByte = inputStream.read();
        }
        outputStream.close();


    }
}
