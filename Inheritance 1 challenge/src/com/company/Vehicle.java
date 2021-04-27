package com.company;

public class Vehicle {

    private int speed;

    public Vehicle(int speed) {
        this.speed = speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void steer() {
        System.out.println("steer() called");
    }

    public void gearUp() {
        System.out.println("gearUp() called");
    }

    public void gearDown() {
        System.out.println("gearDown() called");
    }
}
