package com.souvik.Day41;

import java.util.Arrays;

public class BinarySearch_2D {

    public static void main(String[] args) {

        int[][] mat= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(binary(mat,9)));
    }

    static int[] binary(int [][] mat, int target)
    {

        /*Time Complexity is n*/
        int r = 0;
        int col = mat.length - 1;

        while(r < mat.length && col >=0)
        {
            if(mat[r][col] == target)
            {
                return new int[]{r,col};
            }
            if(mat[r][col]<target)
            {
                r++;
            }
            else
            {
                col--;
            }
        }

        return new int[]{-1,-1};
    }
}
