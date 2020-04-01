package com.company;

import java.util.Scanner;

public class FriendlyPair {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the two integers here.");

        int a = s.nextInt();
        int b = s.nextInt();

        if (ratio(a) == ratio(b))
            System.out.println("Friendly Pair");
        else
            System.out.println("Not Friendly Pair");


    }

    public static double ratio(int i){

        double sum=0;

        for(int j=1; j<=i; j++) {
            if (i%j==0)
                sum += j;
        }
        return sum/i;
    }




}

