package com.lab_4;

public class Director {
    private final String name;
    private final String surname;
    private final String passport;
    private final Firm drFirm;

    public Director(String name, String surname, String passport, Firm drFirm){
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.drFirm = drFirm;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPassport() {
        return passport;
    }

    public Firm getDrFirm() {
        return drFirm;
    }
}
