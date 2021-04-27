package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        ArrayList<String> writtenList = new ArrayList<String>();
        writtenList.add(0, this.name);
        writtenList.add(1, "" + this.hitPoints);
        writtenList.add(2, "" + this.strength);
        return writtenList;
    }

    @Override
    public void read(List<String> readValues) {
        if (readValues != null && readValues.size() > 0) {
            this.name = readValues.get(0);
            this.hitPoints = Integer.parseInt(readValues.get(1));
            this.strength = Integer.parseInt(readValues.get(2));
        }

    }
}
