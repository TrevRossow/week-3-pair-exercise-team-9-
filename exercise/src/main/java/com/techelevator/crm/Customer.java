package com.techelevator.crm;

import com.techelevator.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {

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

    }
}

