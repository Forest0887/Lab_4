package com.lab_4;

import java.util.Scanner;

public class Main {

    public static int summ(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(summ(a, b));

    }
}
