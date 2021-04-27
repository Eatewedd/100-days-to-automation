package com.company;

public class DeluxeHamburger extends Hamburger {
    private String chipsName;
    private double chipsPrice;
    private String drinkName;
    private double drinkPrice;

    public DeluxeHamburger(String burgerName, String breadRollType, String meatType, double price, String chipsName, double chipsPrice, String drinkName, double drinkPrice) {
        super(burgerName, breadRollType, meatType, price);
        this.chipsName = chipsName;
        this.chipsPrice = chipsPrice;
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    @Override
    public void addHamburgerLettuce(String chipsName, double chipsPrice) {
        super.addHamburgerLettuce(chipsName, chipsPrice);
    }

    @Override
    public void addHamburgerTomato(String drinkName, double drinkPrice) {
        super.addHamburgerTomato(drinkName, drinkPrice);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }
}
