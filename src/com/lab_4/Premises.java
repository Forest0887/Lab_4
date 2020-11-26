package com.lab_4;

public class Premises {
    private final String address;
    private final int square;

    public Premises(String address, int square){
        this.address = address;
        this.square = square;
    }

    public String getAddress() {
        return address;
    }

    public int getSquare() {
        return square;
    }
}
