package com.example.game;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

   /* public ArrayList<String> write() {
        List<String> writtenFieldList = new ArrayList<>();
        return writtenFieldList;
    }

    public void read(ArrayList<String> readFieldList) {
        ArrayList<String> newList = new ArrayList<>();
        newList.add(0, "sample");
        for(int i = 0; i >= readFieldList.size(); i++) {
            newList.add(i, readFieldList.get(i));
        }
    }*/

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> writtenList = new ArrayList<>();
        writtenList.add(0, this.name);
        writtenList.add(1, "" + this.hitPoints);
        writtenList.add(2, "" + this.strength);
        writtenList.add(3, this.weapon);
        return writtenList;
    }

    @Override
    public void read(List<String> readList) {
        if (readList != null && readList.size() > 0) {
            this.name = readList.get(0);
            this.hitPoints = Integer.parseInt(readList.get(1));
            this.strength = Integer.parseInt(readList.get(2));
            this.weapon = readList.get(3);
        }
    }
}

/*

        -  write(), same as interface. Return a List of the fields in the order they appear in toString().
        takes no arguments and returns a List containing objects of type String.


        -  read(), same as interface. Store the values in the List, in the order they appear in toString().
        Make sure the List is not null and the size() is greater than 0 before storing the values.
        read(), takes a List of type String and doesn't return anything.
        to populate the object's fields from an ArrayList (parameter)


        -  toString(), Players overriding toString() method. It takes no arguments and returns a String in the following format:

Player{name='Tim', hitPoints=10, strength=15, weapon='Sword'}

 -  write(),

        -

        // The interface will just specify two methods, one to return an ArrayList of values to be saved
// and the other to populate the object's fields from an ArrayList (parameter).*/
