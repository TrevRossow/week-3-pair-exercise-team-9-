package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {

    private Pet petTesting;

    @Before
    public void setPetTesting(){
        petTesting=new Pet("Test Name","Test Species");
    }

    @Test
    public void vaccinations_listings_display_2() {
        String input = "Virus A, Virus B";

        List<String> testingList = new ArrayList<>();
        testingList.add("Virus A");
        testingList.add("Virus B");

        petTesting.setVaccinations(testingList);

        String output=petTesting.listVaccinations();

        Assert.assertEquals(input,output);


    }


}
