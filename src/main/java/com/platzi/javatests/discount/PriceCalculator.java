package com.platzi.javatests.discount;

import java.util.ArrayList;
import java.util.List;

public class PriceCalculator {

    private List<Double> prices = new ArrayList<>();
    private double discont = 0.0;

    public double getTotal() {
        double result = 0;
        for (Double price : prices) {
            result += price;
        }

        double totalDiscount = ((result * discont)/100);

        return (result-totalDiscount);
    }

    public void addPrice(double price) {
        prices.add(price);
    }

    public void setDiscount(double discont) {
        this.discont = discont;
    }
}
