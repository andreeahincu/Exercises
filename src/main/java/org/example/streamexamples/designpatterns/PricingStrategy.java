package org.example.streamexamples.designpatterns;

import java.util.Map;

public interface PricingStrategy {
        double calculateTotal(Map<String, Integer> items);
}
