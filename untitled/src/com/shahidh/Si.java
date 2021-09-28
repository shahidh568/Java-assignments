package com.shahidh;

import java.util.Scanner;

public class Si {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter principle: ");
        int p = in.nextInt();
        System.out.println("Enter rate of interest in percentage: ");
        float r = in.nextFloat();
        System.out.println("Enter time/period in years: ");
        float t = in.nextFloat();
        //formula for calculating simple interest
        float si = (p*r*t)/100;
        System.out.println("The simple interest is : "+si);
    }
}
