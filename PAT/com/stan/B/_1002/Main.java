package com.stan.B._1002;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        char[] chars = str.toCharArray();
        int sum =0;
        for (char aChar : chars) {
            sum += aChar - '0';
        }
        // System.out.println(sum);
        char[] c = (sum + "").toCharArray();
        // System.out.println(c);
        boolean flag = false;
        for (char value : c) {
            if (flag) System.out.print(" ");
            out(value);
            flag = true;
        }
    }

    private static void out(char c) {
        switch (c) {
            case '1':
                System.out.print("yi");
                break;
            case '2':
                System.out.print("er");
                break;
            case '3':
                System.out.print("san");
                break;
            case '4':
                System.out.print("si");
                break;
            case '5':
                System.out.print("wu");
                break;
            case '6':
                System.out.print("liu");
                break;
            case '7':
                System.out.print("qi");
                break;
            case '8':
                System.out.print("ba");
                break;
            case '9':
                System.out.print("jiu");
                break;
            case '0':
                System.out.print("ling");
                break;
        }
    }
}
