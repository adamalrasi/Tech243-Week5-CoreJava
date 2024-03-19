package com.sparta.aa.collections;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ContainsLetterTest {
    @Test
    public void testConvertMessage() {
        // Arrange
        String expected = "thecatinthehatcomesback";
        // Act
        ContainsLetter container = new ContainsLetter();
        String actual = container.convertMessage("The cat in the hat comes back");
        // Assert
        Assertions.assertEquals(expected, actual);
    }
    
}
