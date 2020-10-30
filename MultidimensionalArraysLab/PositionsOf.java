package MultidimensionalArraysLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine();

        ArrayList<int[]> indexes = new ArrayList<>();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
            matrix[i] = arr;
        }
        boolean notFound = false;
        int n = Integer.parseInt(scanner.nextLine());
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == n) {
                    indexes.add(new int[]{row, col});
                }

            }

        }
        if (indexes.isEmpty()) {
            System.out.println("not found");
        } else {
            for (int[] index : matrix) {
                System.out.println(index[0] + " " + index[1]);
            }
        }
    }
}
