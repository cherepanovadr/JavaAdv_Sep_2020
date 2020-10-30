package MultidimensionalArraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = new int[size][size];
        for (int row = 0; row < size; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(e -> Integer.parseInt(e)).toArray();
        }
        System.out.println();


        int a = countDiagonalA(matrix, size);
        int b = countDiagonalB(matrix, size);

        int total = Math.abs(a - b);
        System.out.println(total);

    }

    private static int countDiagonalB(int[][] matrix, int size) {
        int sum = 0;
        int row = size - 1;
        int col = 0;
        while (row >= 0 && col < size) {
            sum += matrix[row][col];
            row--;
            col++;
        }
        return sum;
    }

    private static int countDiagonalA(int[][] matrix, int size) {
        int sum = 0;
        int col = 0;
        for (int row = 0; row < size; row++, col++) {
            sum += matrix[row][col];
        }

        return sum;
    }


}
