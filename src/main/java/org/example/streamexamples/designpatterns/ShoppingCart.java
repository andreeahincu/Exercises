package org.example.streamexamples.designpatterns;
import java.util.HashMap;
import java.util.Map;
public class ShoppingCart {
    private Map<String, Integer> items;
    private PricingStrategy pricingStrategy;

    public ShoppingCart(){
        this.items = new HashMap<>();
    }
    public void setPricingStrategy(PricingStrategy pricingStrategy){
        this.pricingStrategy = pricingStrategy;
    }

    public void addItem(String item, int quantity){
        items.put(item, quantity);
    }

    // calculate the total cost using the chosen pricing strategy
    public double calculateTotal(){
        return pricingStrategy.calculateTotal(items);
    }


}
