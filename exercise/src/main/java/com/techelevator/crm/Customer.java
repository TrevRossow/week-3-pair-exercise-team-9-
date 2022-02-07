package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {

    //vars
    private String phoneNumber;
    private List<String>pets = new ArrayList();

    //sets

    public void setPets(List<String> pets) {
        this.pets = pets;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //gets
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

    //constructors
    public Customer (String firstName, String lastName, String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Customer (String firstName, String lastName) {
        super(firstName, lastName);
        this.phoneNumber = "";
    }

    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double balanceDue=0.0;
        for(String service: servicesRendered.keySet()){
            balanceDue+=servicesRendered.get(service);
        }
        return balanceDue;
    }
}

