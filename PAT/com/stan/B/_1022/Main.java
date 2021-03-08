package com.stan.B._1022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int d = in.nextInt();
        int c = a + b;
        if (c == 0) System.out.print(0);
        int temp = 0;
        String result = "";
        while(c > 0){
            temp = c % d;
            c /= d;
            result = temp + result;
        }
        System.out.print(result);
    }
}
