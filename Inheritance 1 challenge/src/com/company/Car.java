package com.company;

public class Car extends Vehicle{

    private boolean lpgOn;
    private boolean foldMirrors;

    public Car(int speed, boolean lpgOn, boolean foldMirrors) {
        super(speed);
        this.lpgOn = lpgOn;
        this.foldMirrors = foldMirrors;
    }

    public void setLpgOn(boolean lpgOn) {
        this.lpgOn = lpgOn;
    }

    public void setFoldMirrors(boolean foldMirrors) {
        this.foldMirrors = foldMirrors;
    }

    @Override
    public void gearUp() {
        super.gearUp();
    }

    @Override
    public void gearDown() {
        super.gearDown();
    }
}
