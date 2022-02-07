package com.techelevator.crm;

import com.techelevator.Billable;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    @Test
    public void test_getBalanceDue() {
        Customer customer = new Customer("Brendon", "Kelley");
        Map<String, Double>testMap = new HashMap<>();
        testMap.put("Grooming", 50.00);
        testMap.put("Walking", 40.00);
        testMap.put("Sitting", 70.00);

        double total = customer.getBalanceDue(testMap);

        Assert.assertEquals(140, total, 0.0);
    }
}
