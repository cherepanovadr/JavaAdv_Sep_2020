package FilesAndStreamsExercises;

import SetsAndMapsLab.ParkingLot;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\chere\\OneDrive\\Документы\\output.txt";
        List<String> lines = Files.readAllLines(Path.of(path));
        for (String line : lines) {
            System.out.println(line);

        }


    }
}
