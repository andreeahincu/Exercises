package org.example.streamexamples.designpatterns;

import java.util.Map;

public class RegularPricing implements PricingStrategy {

    private double getRegularPrice(String item) {
        // for simplicity, we assume a fixed price for each item
        return 15.5;
    }

    @Override
    public double calculateTotal(Map<String, Integer> items) {
        double total = 0;
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            // add regular price for each item
            total = total + entry.getValue() * getRegularPrice(entry.getKey());
        }
        return total;
    }


}
