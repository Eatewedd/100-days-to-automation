package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Bank {

    private String name;
    private ArrayList<Branch> branches; //drill //creating class attributes


    public Bank(String name) { //drill //Why does this constructor have only one parameter here? Because only one is called dumbass

        this.name = name; // setting initial values for object attributes
        this.branches = new ArrayList<>();
    }

    //addBranch(), has one parameter of type String (name of the branch)
    // and returns a boolean. It returns true if the branch was
    // added successfully or false otherwise.
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) != null) {
            return false;
        } else {
            Branch branch = new Branch(branchName);
            branches.add(branch);
        }
        return true;
    }
    //addCustomer(), has three parameters of type String (name of the branch), String (name of the customer),
    // double (initial transaction) and returns a boolean.
    // It returns true if the customer was added successfully or false otherwise.
    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }

        return false;
    }

    //addCustomerTransaction(), has three parameters of type String (name of the branch),
    // String (name of the customer), double (transaction) and returns a boolean.
    // It returns true if the customers transaction was added successfully or false otherwise.
    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);
        if(branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }

        return false;
    }
        //findBranch(), has one parameter of type String (name of the Branch) and returns a Branch.
        // Return the Branch if it exists or null otherwise.
        private Branch findBranch(String branchName) {
            for(int i=0; i<this.branches.size(); i++) {
                Branch branch = this.branches.get(i);
                if(branch.getName().equals(branchName)) {
                    return branch;
                }
            }
            return null;

        }
     // listCustomers(), has two parameters of type String (name of the Branch),
    // boolean (print transactions) and returns a boolean. Return true if the branch exists or false otherwise.
    // This method prints out a list of customers.
     public boolean listCustomers(String branchName, boolean showTransactions) {
         Branch branch = findBranch(branchName);
         if(branch != null) {
             System.out.println("Customer details for branch " + branch.getName());

             ArrayList<Customer> branchCustomers = branch.getCustomers();
             for(int i=0; i<branchCustomers.size(); i++) {
                 Customer branchCustomer = branchCustomers.get(i);
                 System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                 if(showTransactions) {
                     System.out.println("Transactions");
                     ArrayList<Double> transactions = branchCustomer.getTransactions();
                     for(int j=0; j<transactions.size(); j++) {
                         System.out.println("[" + (j+1) + "]  Amount "  + transactions.get(j));
                     }
                 }
             }
             return true;
         } else {
             return false;
         }
     }
}