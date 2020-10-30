package FilesAndStreamsExercises;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipArchive {
    public static void main(String[] args) throws IOException {
        ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream("D:\\Downloads\\text-files.zip"));
        FileInputStream fis = new FileInputStream(
                new File("D:\\Downloads\\file1.txt"));
        int byteContainter;
        zos.putNextEntry(new ZipEntry("words.txt"));

        while((byteContainter = fis.read())!=-1){
            zos.write(byteContainter);
        }
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("count-chars.txt"));
        fis = new FileInputStream(
                new File("D:\\Downloads\\file2.txt"));
        while((byteContainter = fis.read())!=-1){
            zos.write(byteContainter);
        }
        zos.closeEntry();
        zos.putNextEntry(new ZipEntry("lines.txt"));
        fis = new FileInputStream(
                new File("D:\\Downloads\\file3.txt"));
        while((byteContainter = fis.read())!=-1){
            zos.write(byteContainter);
        }
        zos.closeEntry();
        zos.finish();
        zos.close();



    }}
