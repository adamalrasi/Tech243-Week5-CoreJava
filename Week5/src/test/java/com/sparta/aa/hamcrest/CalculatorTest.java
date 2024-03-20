package com.sparta.aa.hamcrest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.*;

import java.util.List;

import org.hamcrest.MatcherAssert;
import org.hamcrest.object.HasToString;

import static org.hamcrest.MatcherAssert.*;

public class CalculatorTest {

    @Test
    void given2And6_Add_Returns8Pt0() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertEquals(8.0, calc.add());
        assertThat(calc.add(), is(8.0));
    }

    @Test
    void given6And3_DivisibleBy_ReturnsTrue() {
        Calculator calc = new Calculator(6, 2);

        Assertions.assertTrue(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(true));
    }

    @Test
    void given7And3_DivisibleBy_ReturnsFalse() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertFalse(calc.divisibleBy());
        assertThat(calc.divisibleBy(), is(false));
    }

    @Test
    void given7And3_ToString_OutputContainsCalculator() {
        Calculator calc = new Calculator(7, 3);

        Assertions.assertTrue(calc.toString().contains("Calculator"));

        assertThat(calc.toString(), containsString("Calculator"));

    }

    @Test
    void given2And7_Add_Returns9Pt0() {
        Calculator calculator = new Calculator(2, 7);
        assertThat(calculator.add(), is(equalTo(9.0)));
        assertThat(calculator.add(), is(9.0));
        assertThat(calculator.add(), equalTo(9.0));

        // Domain Specific Language - language specific terms
        // Fluent API - reads like English
    }

    @Test
    void collectionMatchersExercise() {

        List<String> fruit = List.of(
                "apple", "pear", "banana", "peach", "pomegranate", "pineapple", "lemon");

        // Task 1: 
        assertThat(fruit.size(), is(7));
        assertThat(fruit.contains("apple"), is(true));

        // Task 2:
        assertThat(fruit, containsInRelativeOrder("apple", "banana"));

        // Task 3:
        assertThat(fruit.contains("banana"), is(true));
        assertThat(fruit.contains("pear"), is(true));

        // Task 4:
        assertThat(fruit, not(hasItems("grape")));

        // Task 5:
        assertThat(fruit, not(hasItem(endsWith("z"))));



    }



}

