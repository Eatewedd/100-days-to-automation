package com.company;

public class HealthyBurger extends Hamburger{
    private String onionName;
    private double onionPrice;

    private String pickledPepperName;
    private double pickledPepperPrice;


    public HealthyBurger(String burgerName, String breadRollType, String meatType, double price, String onionName,
                         double onionPrice, String pickledPepperName, double pickledPepperPrice) {
        super(burgerName, breadRollType, meatType, price);
        this.onionName = onionName;
        this.onionPrice = onionPrice;
        this.pickledPepperName = pickledPepperName;
        this.pickledPepperPrice = pickledPepperPrice;
    }

    @Override
    public void addHamburgerLettuce(String onionName, double onionPrice) {
        super.addHamburgerLettuce(onionName, onionPrice);
    }

    @Override
    public void addHamburgerTomato(String pickledPepperName, double tomatoPrice) {
        super.addHamburgerTomato(pickledPepperName, pickledPepperPrice);
    }

    @Override
    public double itemizeHamburger() {
        return super.itemizeHamburger();
    }

}
