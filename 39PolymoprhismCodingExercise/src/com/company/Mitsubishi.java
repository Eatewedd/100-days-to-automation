package com.company;

public class Mitsubishi extends Car {


    public Mitsubishi(int cylinders, String name, boolean engine, int wheels) {
        super(cylinders, name);
    }

    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public boolean startEngine() {
        super.startEngine();
        return false;
    }

    @Override
    public void accelerate() {
        super.accelerate();
    }

    @Override
    public void brake() {
        super.brake();
    }
}
