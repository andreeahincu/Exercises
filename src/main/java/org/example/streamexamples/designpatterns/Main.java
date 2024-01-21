package org.example.streamexamples.designpatterns;

public class Main {

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addItem("ProductA", 2);
        shoppingCart.addItem("ProductB", 3);

        // Use RegularPricing strategy
        shoppingCart.setPricingStrategy(new RegularPricing());
        double regularTotal = shoppingCart.calculateTotal();
        System.out.println("Regular total : $"+regularTotal);

        //Use DiscountPricing strategy
        shoppingCart.setPricingStrategy(new DiscountPricing());
        double discountTotal = shoppingCart.calculateTotal();
        System.out.println("Discounted total: $" +discountTotal);

        // Use HolidayPricing strategy
        shoppingCart.setPricingStrategy(new HolidayPricing());
        double holidayTotal = shoppingCart.calculateTotal();
        System.out.println("Holiday Total: $" + holidayTotal);
    }
}
