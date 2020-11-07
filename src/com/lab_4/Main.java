package com.lab_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        boolean asd = false;
        for (int i = 2; i < 10; i++){
            for (int j = 2; j < 10; j++){
                String c = i + Integer.toString(j);
                int b = Integer.parseInt(c);
                if (i*j*(b) == a){
                    System.out.print(b);
                    asd = true;
                }
            }
        }
        if (!asd){
            System.out.println("ERROR");
        }
    }
}
