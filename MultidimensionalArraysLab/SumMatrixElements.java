package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] size = readArray(scanner, ", ");
        int rows = size[0];
        int cols = size[1];
        int sum = 0;
        int[][] matrix = readMatrix(scanner, rows, cols, ", ");
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                sum += anInt;

            }

        }
        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }

    private static int[][] readMatrix(Scanner scanner, int rows, int cols, String pattern) {
        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            int[] array = readArray(scanner, pattern);
            matrix[row] = array;

        }

        return matrix;
    }

    private static int[] readArray(Scanner scanner, String pattern) {
        return Arrays.stream(scanner.nextLine().split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
