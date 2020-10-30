package SetsAndMapsExercises;

import java.util.*;

public class fixEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String, String> emails = new LinkedHashMap<>();
        int count = 0;
        String inputPrev = "";
        while (!input.equals("stop")) {
            if (count % 2 == 0) {
                emails.putIfAbsent(input, "");
            } else {
                emails.put(inputPrev, input);
            }

            inputPrev = input;
            input = scanner.nextLine();
            count++;
        }
        List<String> forDeletion = new ArrayList<>();
        for (Map.Entry<String, String> entry : emails.entrySet()) {
            if (entry.getValue().contains("us") || entry.getValue().contains("uk") || entry.getValue().contains("com")) {
                String emailToRemove = entry.getKey();
                forDeletion.add(emailToRemove);
            }
        }
        for (String s : forDeletion) {
            emails.remove(s);
        }


        for (Map.Entry<String, String> entry : emails.entrySet()) {
            System.out.println(String.format("%s -> %s", entry.getKey(), entry.getValue()));
        }


    }

}

