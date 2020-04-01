package com.company;

import java.util.Scanner;

public class Handshakes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println ("Enter the number of students present.");

        int n = s.nextInt();
        int counter = n*(n-1)/2;

        System.out.println("The maximum number of handshakes is " + counter);


    }

}
