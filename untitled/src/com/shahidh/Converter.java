package com.shahidh;

import java.util.Scanner;

public class Converter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter currency in rupees: ");
        double rupees = in.nextFloat();
        double usd = rupees*0.013;
        System.out.println("rupees in usd = "+usd);

    }
}
