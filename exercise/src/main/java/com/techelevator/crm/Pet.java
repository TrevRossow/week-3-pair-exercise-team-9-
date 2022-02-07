package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {

    //instance variables
    private String name;
    private String species;
    private List<String> vaccinations = new ArrayList<>();

    //constructor

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    //method
    public String listVaccinations() {//need to remove the commas in the comma-delimited string
        String vaccinesReceived = "";
        for (String result : vaccinations) {
            vaccinesReceived += result + ", ";
        }

        if (vaccinesReceived.length() > 2) {
            vaccinesReceived = vaccinesReceived.substring(0, vaccinesReceived.length() - 2);
        }

        return vaccinesReceived;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}


