package FilesAndStreamsExercises;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String pathFile = "D:\\Downloads\\04. Java-Advanced-Streams-Files-and-Directories-Resources (1)\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";
        int Vowels = 0;
        int Consonants = 0;
        int Punctuation = 0;
        String vowels = "aeiou";
        String punct = "!,.?";

        BufferedReader reader = new BufferedReader(new FileReader(pathFile));
        String line = reader.readLine();
        while (line != null) {
            String[] words = line.split("\\s+");
            for (String word : words) {
                for (char s : word.toCharArray()) {
                    if (vowels.contains(String.valueOf(s))) {
                        Vowels++;
                    } else if (punct.contains(String.valueOf(s))) {
                        Punctuation++;
                    } else {
                        Consonants++;
                    }

                }

            }


            line = reader.readLine();

        }
        reader.close();
        PrintWriter writer = new PrintWriter("outputCounts.txt");
        writer.println("Vowels: " + Vowels);
        writer.println("Consonants: " + Consonants);
        writer.println("Punctuation: " + Punctuation);
        writer.close();


    }


}
