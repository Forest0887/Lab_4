package com.lab_4;

import java.util.ArrayList;

public class Firm {
    private final String name;
    private final int capital;
    private final String typeOfBusiness;
    private final ArrayList<Premises> frPremises = new ArrayList<>();

    public Firm(String name, int capital, String typeOfBusiness){
        this.name = name;
        this.capital = capital;
        this.typeOfBusiness = typeOfBusiness;
    }

    public String getName() {
        return name;
    }

    public int getCapital() {
        return capital;
    }

    public String getTypeOfBusiness() {
        return typeOfBusiness;
    }

    public ArrayList<Premises> getFrPremises() {
        return frPremises;
    }

    public void setFrPremises(Premises frPremises) {
        this.frPremises.add(frPremises);
    }
}
