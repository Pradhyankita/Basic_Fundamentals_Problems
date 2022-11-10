package com.bridgelabz.pp1;

public class TwoStringsEqual {
    public static void main(String[] args) {
        String a = "Arpita";
        String b = "Arpita";

        if(a.length() == b.length()){
            System.out.println(a.equals(b));
            System.out.println("Both strings are equal");
        }else{
            System.out.println("Length of strings are not same, Strings are not Equal!");
        }
    }
}
