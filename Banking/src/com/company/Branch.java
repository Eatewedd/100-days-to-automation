package com.company;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //newCustomer(), has two parameters of type String (name of customer),
    // double (initial transaction) and returns a boolean. Returns true
    // if the customer was added successfully or false otherwise.
    public boolean newCustomer(String customerName, double initialTransaction) {
        if(findCustomer(customerName) == null) {
            Customer customer = new Customer(customerName, initialTransaction);
            customers.add(customer);
            return true;
        } else {
            return false;
        }
    }

        //addCustomerTransaction(), has two parameters of type String (name of customer),
        // double (transaction) and returns a boolean. Returns true
        // if the customers transaction was added successfully or false otherwise.
        public boolean addCustomerTransaction(String customerName, double transaction) {
            Customer existingCustomer = findCustomer(customerName);
            if(existingCustomer != null) {
                existingCustomer.addTransaction(transaction);
                return true;
            }

            return false;
        }

        //findCustomer(), has one parameter of type String (name of customer)
        // and returns a Customer. Return the Customer if they exist, null otherwise.
        private Customer findCustomer(String customerName){
            for (int i = 0; i < this.customers.size(); i++) {
                Customer customer = this.customers.get(i);
                if (customer.getName().equals(customerName)) {
                    return customer;
                }
            } return null;
        }
}