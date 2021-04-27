package com.company;

public class ChestOfDrawers {
    private double height;
    private double depth;
    private double width;

    private boolean lamp;
    private boolean flower;

    public ChestOfDrawers(double height, double depth, double width, String lamp, String flower) {
        if(height < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
        if(depth < 0) {
            this.depth = 0;
        } else {
            this.depth = depth;
        }
        if(width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }
        this.lamp = true;
        this.flower = true;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLamp(boolean lamp) {
        this.lamp = lamp;
    }

    public void setFlower(boolean flower) {
        this.flower = flower;
    }

    public double getHeight() {
        return height;
    }

    public double getDepth() {
        return depth;
    }

    public double getWidth() {
        return width;
    }

    public boolean isLamp() {
        return lamp;
    }

    public boolean isFlower() {
        return flower;
    }

    public double getVolume() {
        return height * depth * width;
    }

}
