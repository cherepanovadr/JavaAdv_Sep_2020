package MultidimensionalArraysExercises;

import java.util.Scanner;

public class TheHeiganDance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double damage = Double.parseDouble(scanner.nextLine());
//{spell} {row} {col} – {spell} is either Cloud or Eruption
        double playerPower = 18500;
        double heiganPower = 3000000;
        int[][] matrix = new int[15][15];
        for (int row = 0; row < 15; row++) {
            for (int col = 0; col < 15; col++) {
                matrix[row][col] = -1;
            }
        }
        int[] player = {7, 7};
        String input = scanner.nextLine();
        boolean heiganDefeated = false;
        while (playerPower > 0 || heiganPower > 0) {
            heiganPower -= damage;
            if (heiganPower <= 0) {
                heiganDefeated = true;
                break;
            }
            String[] tokens = input.split("\\s+");
            String spell = tokens[0];
            int rowHit = Integer.parseInt(tokens[1]);
            int colHit = Integer.parseInt(tokens[2]);
            if (spell.equals("Cloud")) {



            //    if( matrix[rowHit][colHit])



            } else if (spell.equals("Eruption")) {


            }

            input = scanner.nextLine();

        }
        System.out.println();


    }
}
