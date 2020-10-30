package MultidimensionalArraysExercises;

import java.util.Scanner;

public class fillTheMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int size = Integer.parseInt(input[0]);
        int startNumber = 1;
        int[][] matrix = new int[size][size];
        String pattern = input[1];
        if (pattern.equals("A")) {
            fillPatternA(size, startNumber, matrix);
        } else if (pattern.equals("B")) {
            fillPatternB(size, startNumber, matrix);
        }
        printMatrix(matrix, size, size);
    }

    private static void fillPatternB(int size, int startNumber, int[][] matrix) {
        for (int col = 0; col < size; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < size; row++) {
                    matrix[row][col] = startNumber++;

                }
            } else {
                for (int row = size - 1; row >= 0; row--) {
                    matrix[row][col] = startNumber++;
                }
            }
        }
    }

    private static void fillPatternA(int size, int startNumber, int[][] matrix) {
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                matrix[row][col] = startNumber++;
            }
        }
    }

    public static void fillMatrix(Scanner scanner, int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = scanner.nextInt();
            }
        }
    }

    public static void printMatrix(int[][] matrix, int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return row < 0 || row >= matrix.length
                || col < 0 || col >= matrix[row].length;
    }
    public static boolean isInBounds(int row, int col, int[][] matrix) {
        return !isOutOfBounds(row,col,matrix);
    }

}
