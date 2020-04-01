package com.company;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the integer here.");

        int a = s.nextInt();

        int [][] array = new int[a + 1][ (a * 2) + 1];

        array[0][a] = 1;
        System.out.println(1);

        for(int i=0; i<a; i++){
            for(int j=0; j<2 * a; j++){
                array[i + 1][j] = array[i][j] + array[i][j + 1] ;
                if (array[i + 1][j]!=0)
                    System.out.print(array[i + 1][j] +" ");


            }
            System.out.println();
        }
    }

}
