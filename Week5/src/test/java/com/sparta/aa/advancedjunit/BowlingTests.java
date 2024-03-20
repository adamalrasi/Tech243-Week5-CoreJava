package com.sparta.aa.advancedjunit;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class BowlingTests {
    /*
     * Red, Green, Refactor
     */

     @Test
     public void whenAllStrikesScoreReturnThreeHundred(){
        Assertions.assertEquals("300", Bowling.calculateScore("300"));
     }
}
