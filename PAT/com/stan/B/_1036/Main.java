package com.stan.B._1036;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char a = in.next().charAt(0);
        for(int i=0; i<n; i++)
            System.out.print(a);
        System.out.println();
        int row =0;
        if(n%2 == 0) {
            row = n/2;
        }
        else{
            row = (n+1)/2;
        }
        for(int i=0; i<row-2; i++){
            System.out.print(a);
            for(int j=0; j<n-2; j++) {
                System.out.print(" ");
            }
            System.out.println(a);
        }
        for(int i=0; i<n; i++)
            System.out.print(a);
    }
}
