package com.stan.B._1009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] result = str.split(" ");
        for(int i = result.length-1; i>=0; i--) {
            System.out.print(result[i]);
            if(i!=0) {
                System.out.print(" ");
            }
        }
    }
}
