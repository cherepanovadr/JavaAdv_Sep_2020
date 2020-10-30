package MultidimensionalArraysLab;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[][] matrix = {
                {12,13},
                {15,13},
                {1},
                {0}
        };
        int[] innerMatrix = matrix[1];
        matrix[1][0] = -13;

        System.out.println(innerMatrix[0]);


    }
}
