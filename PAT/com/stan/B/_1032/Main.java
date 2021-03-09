package com.stan.B._1032;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int MAX = 10000;
        int[] scores = new int[MAX];
        int maxScore = 0;
        int flag = 0;
        while(n > 0) {
            int school = in.nextInt();
            int score = in.nextInt();
            scores[school-1] += score;
            if(maxScore < scores[school-1]) {
                maxScore = scores[school-1];
                flag = school;
            }
            n--;
        }
        System.out.print(flag + " " + maxScore);
    }
}
