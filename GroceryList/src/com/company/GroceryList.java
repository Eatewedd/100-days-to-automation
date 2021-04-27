package com.company;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class GroceryList {

    //creating private variable for our ArrayList
    //defining type of object that will be saved into the ArrayList
    //ArrayList is actually a class and it can have its own constructor
    //we're calling an empty constructor
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {

        groceryList.add(item); //automatically adds the item to the ArrayList
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i = 0; i < groceryList.size(); i++)
            System.out.println((i + 1) + ". " + groceryList.get(i));
   }

    private void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if(position >= 0) {
        modifyGroceryItem(position, newItem);
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position+1) + "has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }
}
