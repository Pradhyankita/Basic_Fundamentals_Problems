package com.bridgelabz.pp1;

public class StaticEx {
    static float a = 45.05f;
    static float b = 50.56f;

    public static void main(String[] args) {
        sum(a,b);
    }

    public static void sum(float a, float b){
        System.out.println(a+b);
    }
}
