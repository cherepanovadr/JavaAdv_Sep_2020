package MultidimensionalArraysLab;

import java.util.*;

public class FindTheRealQueen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 8;
        String[][] matrix = new String[a][a];
        Map<Integer,Integer> check = new HashMap<>();
        for (int row = 0; row < a; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        int count = 0;
        for (int row = 0; row < a; row++) {
            for (int col = 0; col < a; col++) {
                String current = matrix[row][col];
                if (current.equals("q")) {
                    count++;
                }

            }

        }
       //int[][] checkArray =

    }
}
