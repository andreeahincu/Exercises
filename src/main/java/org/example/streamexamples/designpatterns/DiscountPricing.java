package org.example.streamexamples.designpatterns;

import java.util.Map;

public class DiscountPricing implements PricingStrategy{
    private double getDiscountedPrice(String item){
        return 12.7;
    }

    @Override
    public double calculateTotal(Map<String, Integer> items) {
        double total = 0;
        for(Map.Entry<String, Integer> entry : items.entrySet()){
            total = total + entry.getValue() * getDiscountedPrice(entry.getKey());
        }
        return total;
    }
}
