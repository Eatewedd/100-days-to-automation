package com.company;

public class Hamburger {
    private String burgerName;
    private String breadRollType;
    private String meatType;
    private double price;

    private String lettuceName;
    private double lettucePrice;

    private String tomatoName;
    private double tomatoPrice;

    private String pickleName;
    private double picklePrice;

    private String sauceName;
    private double saucePrice;

    public Hamburger(String burgerName, String breadRollType, String meatType, double price) {
        this.burgerName = burgerName;
        this.breadRollType = breadRollType;
        this.meatType = meatType;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void addHamburgerLettuce(String lettuceName, double lettucePrice) {
        this.lettuceName = lettuceName;
        this.lettucePrice = lettucePrice;
    }

    public void addHamburgerTomato(String tomatoName, double tomatoPrice) {
        this.tomatoName = tomatoName;
        this.tomatoPrice = tomatoPrice;
    }

    public void addHamburgerPickle(String pickleName, double picklePrice) {
        this.pickleName = pickleName;
        this.picklePrice = picklePrice;
    }

    public void addHamburgerSauce(String sauceName, double saucePrice) {
        this.sauceName = sauceName;
        this.saucePrice = saucePrice;
    }

    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(burgerName + " hamburger " + " on a " + breadRollType + " roll " + "price is " + this.price);
        if(this.lettuceName != null) {
            hamburgerPrice += lettucePrice;
            System.out.println("Added " + lettuceName + " for an extra " + lettucePrice);
        }
        if(this.tomatoName != null) {
            hamburgerPrice += tomatoPrice;
            System.out.println("Added " + tomatoName + " for an extra " + tomatoPrice);
        }
        if(this.pickleName != null) {
            hamburgerPrice += picklePrice;
            System.out.println("Added " + pickleName + " for an extra " + picklePrice);
        }
        if(this.sauceName != null) {
            hamburgerPrice += saucePrice;
            System.out.println("Added " + sauceName + " for an extra " + saucePrice);
        }

        return hamburgerPrice;

    }
}