package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();
        String [][] matrix = new String [rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
        String input = scanner.nextLine();
        while (!input.equals("END")) {
            try {
            String[] line = input.split("\\s+");
                int first = Integer.parseInt(line[1]);
                int second = Integer.parseInt(line[2]);
                int third = Integer.parseInt(line[3]);
                int fourth = Integer.parseInt(line[4]);
                String index1 = matrix[first][second];
                String index2 = matrix[third][fourth];
                matrix[first][second] = index2;
                matrix[third][fourth] = index1;
                printMatrix(rows, cols, matrix);
                input = scanner.nextLine();
            }
            catch(Exception e) {
                System.out.println("Invalid input!");
                input = scanner.nextLine();
            }
        }
    }

    private static void printMatrix(int rows, int cols, String[][] matrix) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
