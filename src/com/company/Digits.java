package com.company;

import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println ("Enter the integer here.");

        int n = s.nextInt();
        int counter = 0;

        while(n!=0){

            n /= 10;  // n = n/10;
            counter++;
        }

        System.out.println(counter);


    }

}