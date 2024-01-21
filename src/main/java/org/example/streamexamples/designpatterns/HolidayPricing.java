package org.example.streamexamples.designpatterns;

import java.util.Map;

public class HolidayPricing implements PricingStrategy{
    private double getHolidayPrice(String item){
        return 14.0;
    }

    @Override
    public double calculateTotal(Map<String, Integer> items){
        double total = 0;
        for(Map.Entry<String, Integer> entry : items.entrySet()){
            total = total + entry.getValue() * getHolidayPrice(entry.getKey());
        }
        return total;
    }
}
