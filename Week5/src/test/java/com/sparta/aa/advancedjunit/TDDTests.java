package com.sparta.aa.advancedjunit;

import org.junit.Test;
import org.junit.jupiter.api.*;

public class TDDTests {
    // Red, Green, Refactor
    // 1, 2, Fizz, 4, Buzz, 
    //FizzBuzz
    // 1. write a test.
    // 2. write just enough code to pass test.
    // 3. refactor so that all previous test pass
    /*
     * 
     * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 31, 32, Fizz, 34
     * 
     * 
     */

     @Test
     @DisplayName("check that 2 returns 2")
     public void checkThatTwo_ReturnsTwo(){
        Assertions.assertEquals("2", TDD.getFizzBuzzValue(2));
     }

     @Test
     @DisplayName("check that 3 returns Fizz")
     public void checkThatThreeReturnsFizz(){
        Assertions.assertEquals("Fizz", TDD.getFizzBuzzValue(3));
     }
}