package com.lab_4;

public class Main {
    public static void main(String[] args) {
        Premises number1 = new Premises("улица Ленина дом 12", 50);
        Premises number2 = new Premises("улица Революции дом 24", 100);

        Firm coffee = new Firm("Счастливая кофейня", 10000, "Кофетерий");

        coffee.setFrPremises(number1);
        coffee.setFrPremises(number2);

        Director director = new Director("Генадий", "Октябров", "3287 534243", coffee);

        System.out.println("Директор: " + director.getName() + " " + director.getSurname()
                + ". Пасспорт: " + director.getPassport() + ". Владеет фирмой: " + director.getDrFirm().getName()
                + ".\nС капиталом: " + director.getDrFirm().getCapital()
                + "$. Тип бизнеса: " + director.getDrFirm().getTypeOfBusiness());

        System.out.println("Адреса филиалов:\n" + director.getDrFirm().getFrPremises().get(0).getAddress()
                + " (с площадью " + director.getDrFirm().getFrPremises().get(0).getSquare() + " квадратных метров)"
                + ",\n" + director.getDrFirm().getFrPremises().get(1).getAddress()
                + " (с площадью " + director.getDrFirm().getFrPremises().get(1).getSquare() + " квадратных метров)");
    }
}
