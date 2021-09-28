package com.shahidh;

import java.util.Scanner;

public class ERO {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if(number%2==0){
            System.out.println(number+" is Even ");
        }
        else{
            System.out.println(number+" is odd");
        }
    }
}
