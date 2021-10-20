package com.souvik.Day16;

import java.util.Scanner;

public class Swap_Rows {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = sc.nextInt();
        int[][] arr = new int[rows][cols];
        System.out.println("Enter  elements in the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        swaprows(arr, rows, cols);
    }
    static void swaprows(int[][] arr, int rows, int cols)
    {
        for (int i = 0; i < cols; i++) {
            int temp=arr[0][i];
            arr[0][i]=arr[2][i];
            arr[2][i]=temp;
        }
        System.out.println("Newly Arranged Array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
