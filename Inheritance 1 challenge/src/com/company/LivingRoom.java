package com.company;

public class LivingRoom {
    private ChestOfDrawers chestOfDrawers;
    private RTVCabinet rtvCabinet;
    private TV tv;


    public LivingRoom(ChestOfDrawers chestOfDrawers, RTVCabinet rtvCabinet, TV tv) {
        this.chestOfDrawers = chestOfDrawers;
        this.rtvCabinet = rtvCabinet;
        this.tv = tv;
    }

    public ChestOfDrawers getChestOfDrawers() {
        return chestOfDrawers;
    }

    public void turn() {
        tv.turnOnTheTV();
    }

}
