package MultidimensionalArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumof2X2Submatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dimensions = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split(", ")).mapToInt(e -> Integer.parseInt(e)).toArray();
        }
        int[][] bestMarix = new int[2][2];
        int maxValue = Integer.MIN_VALUE;
        for (int row = 0; row < rows - 1; row++) {
            for (int col = 0; col < cols - 1; col++) {
                int curSum = matrix[row][col] + matrix[row][col + 1] + matrix[row + 1][col] + matrix[row + 1][col + 1];
                if(curSum> maxValue){
                    maxValue = curSum;
                    bestMarix[0][0] =matrix[row][col];
                    bestMarix[0][1] =matrix[row][col + 1];
                    bestMarix[1][0] =matrix[row + 1][col];
                    bestMarix[1][1] =matrix[row + 1][col + 1];
                }

            }

        }
        for (int i = 0; i < bestMarix.length; i++) {
            for (int col = 0; col < bestMarix[i].length; col++) {
                System.out.print(bestMarix[i][col] +" ");
                
            }
            System.out.println();

        }
        System.out.println(maxValue);
        }

    }


