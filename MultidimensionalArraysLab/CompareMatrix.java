package MultidimensionalArraysLab;

import java.util.Scanner;

public class CompareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] firstMatrix = readMatrixofIntegers(scanner);
        int[][] secondMatrix = readMatrixofIntegers(scanner);
        boolean areEqual = compareMatrices(firstMatrix, secondMatrix);
        System.out.println(areEqual ? "equal" : "not equal");

    }

    private static boolean compareMatrices(int[][] firstMatrix, int[][] secondMatrix) {
        if (firstMatrix.length != secondMatrix.length) {
            return false;
        }
        for (int row = 0; row < firstMatrix.length; row++) {
            int[] firstA = firstMatrix[row];
            int[] secondA = secondMatrix[row];
            if (firstA.length != secondA.length) {
                return false;
            }
            for (int col = 0; col < firstA.length; col++) {
                if (firstA[col] != secondA[col]) {
                    return false;
                }

            }


        }
        return true;
    }

    public static int[][] readMatrixofIntegers(Scanner scanner) {
        String[] tokens = scanner.nextLine().split("\\s+");
        int rows = Integer.parseInt(tokens[0]);
        int cols = Integer.parseInt(tokens[1]);

        int[][] matrix = new int[rows][cols];

        for (int r = 0; r < rows; r++) {
            String[] line = scanner.nextLine().split("\\s+");
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = Integer.parseInt(line[c]);
            }
        }

        return matrix;
    }
}
