package com.lab_4;

public class Main {

    public static void main(String[] args) {
        int a = 6111;
        for (int i = 2; i < 10; i++){
            for (int j = 2; j < 10; j++){
                String c = i + Integer.toString(j);
                int b = Integer.parseInt(c);
                if (i*j*(b) == a){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}
