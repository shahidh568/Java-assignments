package com.shahidh;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float a = in.nextFloat();
        System.out.print("Enter the second number: ");
        float b = in.nextFloat();
        System.out.println("enter 1 for addition \n" +
                "enter 2 for substraction \n" +
                "enter 3 for multiply\n" +
                "enter 4 for division \n :");
        int operator = in.nextInt();
        if (operator==1){
            System.out.println(a+b);
        }
        else if(operator==2){
            System.out.println(a-b);
        }
        else if (operator==3){
            System.out.println(a*b);
        }
        else if (operator==4){
            System.out.println(a/b);
        }
        else{
            System.out.println("Please give the correct input");
        }
    }
}
