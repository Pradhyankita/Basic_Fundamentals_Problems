package com.bridgelabz.pp1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to check:- ");
        long year = sc.nextLong();
            if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)){
                while(year >= 1582) {
                    System.out.println(year + " is a Leap year! ");
                    }
                }
            else{
                System.out.println(year + " is not a Leap year! ");
        }

    }
}
