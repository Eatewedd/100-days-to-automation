package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic Burger", "White bread", "beef", 4.00);
        //double price = hamburger.itemizeHamburger();
        hamburger.addHamburgerLettuce("Lettuce", 0.27);
        hamburger.addHamburgerTomato("Tomato", 0.75);
        hamburger.addHamburgerPickle("Pickle", 0.45);
        hamburger.addHamburgerSauce("Sauce", 1);
        //price =
        System.out.println(hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Healthy Burger",
                "Brown Rye Bread Roll",
                "Beef", hamburger.getPrice(), "Onion", 0.25,
                "Pickled Pepper", 0.43);
        //double price2 = healthyBurger.itemizeHamburger();
        healthyBurger.addHamburgerLettuce("Onion", 0.25);
        healthyBurger.addHamburgerTomato("Pickled Pepper", 0.43);
        //price2 = healthyBurger.itemizeHamburger();
        System.out.println(healthyBurger.itemizeHamburger());

        DeluxeHamburger deluxeHamburger = new DeluxeHamburger("Deluxe Hamburger",
                "White bread",
                "Beef", hamburger.getPrice(), "Onion", 0.25,
                "Pickled Pepper", 0.43);
        //double price2 = healthyBurger.itemizeHamburger();
        deluxeHamburger.addHamburgerLettuce("Chips", 1.50);
        deluxeHamburger.addHamburgerTomato("Drink", 2.25);
        System.out.println(deluxeHamburger.itemizeHamburger());
    }
}
