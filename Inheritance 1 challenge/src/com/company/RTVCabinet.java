package com.company;

public class RTVCabinet {
    private int numberOfDrawers;
    private int numberOfShelves;
    private double drawerVolume;

    private boolean miBox;
    private boolean antenna;

    public RTVCabinet(int numberOfDrawers, int numberOfShelves, double drawerVolume, boolean miBox, boolean antenna) {
        this.numberOfDrawers = numberOfDrawers;
        this.numberOfShelves = numberOfShelves;
        this.drawerVolume = drawerVolume;
        this.miBox = miBox;
        this.antenna = antenna;
    }

    public void setNumberOfDrawers(int numberOfDrawers) {
        this.numberOfDrawers = 3;
    }

    public void setNumberOfShelves(int numberOfShelves) {
        this.numberOfShelves = 3;
    }

    public void setDrawerVolume(double drawerVolume) {
        this.drawerVolume = 25;
    }


    public void setMiBox(boolean miBox) {
        this.miBox = miBox;
    }

    public void setAntenna(boolean antenna) {
        this.antenna = antenna;
    }

    public int getNumberOfDrawers() {
        return numberOfDrawers;
    }

    public int getNumberOfShelves() {
        return numberOfShelves;
    }

    public double getDrawerVolume() {
        return drawerVolume;
    }

    public boolean isMiBox() {
        return miBox;
    }

    public boolean isAntenna() {
        return antenna;
    }


}
