package com.company;

public class TV {
    private String make;
    private String resolution;
    private boolean isSmart;

    public TV(String make, String resolution, boolean isSmart) {
        this.make = make;
        this.resolution = resolution;
        this.isSmart = isSmart;
    }

    public void turnOnTheTV() {
        System.out.println(make + " TV is turned on");
    }

    public void showLogo() {
        System.out.println(getMake());
        System.out.println(getResolution());
    }
    public String getMake() {
        return make;
    }

    public String getResolution() {
        return resolution;
    }

    public boolean isSmart() {
        return isSmart;
    }
}
