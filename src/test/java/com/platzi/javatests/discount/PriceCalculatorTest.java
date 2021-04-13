package com.platzi.javatests.discount;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.*;

public class PriceCalculatorTest {

    @Test
    public void total_zero_when_there_are_not_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        assertThat(priceCalculator.getTotal(), is(0.0));
    }

    @Test
    public void total_is_sum_of_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(10.000);
        priceCalculator.addPrice(15.500);

        assertThat(priceCalculator.getTotal(), is(25.500));
    }

    @Test
    public void apply_discount_to_prices() {
        PriceCalculator priceCalculator = new PriceCalculator();
        priceCalculator.addPrice(35.000);
        priceCalculator.addPrice(15.000);

        priceCalculator.setDiscount(25);

        assertThat(priceCalculator.getTotal(), is(37.500));
    }
}