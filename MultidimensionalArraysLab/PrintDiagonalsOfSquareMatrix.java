package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[a][a];

        for (int row = 0; row < a; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
        }
        for (int i = 0; i < a; i++) {
            int current = matrix[i][i];
            System.out.print(current+" ");
            
        }
        System.out.println();
        for (int i = 0; i < a; i++) {
            int current = matrix[a-1-i][i];
            System.out.print(current+" ");
        }

    }
}
