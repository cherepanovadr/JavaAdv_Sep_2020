package Exam25October;

import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split("\\s+");
        int size1 = Integer.parseInt(tokens[0]);
        int size2 = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[size1][size2];
        for (int row = 0; row < size1; row++) {
            for (int col = 0; col < size2; col++) {
                matrix[row][col] = 0;
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Bloom Bloom Plow")) {
            String[] tokens2 = input.split("\\s+");
            int indexRow = Integer.parseInt(tokens2[0]);
            int indexCol = Integer.parseInt(tokens2[1]);
            boolean out = isOutOfBounds(indexRow, indexCol, matrix);
            if (out) {
                System.out.println("Invalid coordinates.");
                input = scanner.nextLine();
                continue;
            }

            for (int row = 0; row < size1; row++) {
                for (int col = 0; col < size2; col++) {
                    if (row == indexRow || col == indexCol) {
                        matrix[row][col] = matrix[row][col] + 1;
                    }
                }

            }

            input = scanner.nextLine();
        }
        printMatrix(matrix, size1, size2);
    }

    public static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return row < 0 || row >= matrix.length
                || col < 0 || col >= matrix[row].length;
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
