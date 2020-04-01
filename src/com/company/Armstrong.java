package com.company;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println ("Enter the two integers here.");

        int a = s.nextInt();
        int b = s.nextInt();

        for(int i=a; i<=b; i++){
            //If i is armstrong number, print it out so the user user knows
            if(isArmstrong(i))
                System.out.println(i);
        }
    }

    public static boolean isArmstrong(int n){


        int counter = 0;
        int c = n;

        while(n!=0){

            n /= 10;  // n = n/10;
            counter++;
        }

        n = c;
        int sum = 0;

        while(c!=0) {
           sum += Math.pow((c%10), counter);
           c/=10;
        }
        //12567 != 1^5+2^5+5^5+6^5+7^5

        return n == sum;

    }


}