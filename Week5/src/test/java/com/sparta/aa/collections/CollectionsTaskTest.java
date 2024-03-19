package com.sparta.aa.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CollectionsTaskTest {
    
    @Test
    @DisplayName("Check if method takes in 15 and returns [5, 10, 15]")
    void checkIfMethodTakesIn15Return51015() {
        // Arrange
        int testMax = 15;
        HashSet<Integer> expected = new HashSet<>();
        CollectionsTask testHashSet = new CollectionsTask();
        HashSet<Integer> actual = testHashSet.makeFiveSet(testMax);
        // Act
        expected.add(5);
        expected.add(10);
        expected.add(15);
        // Assert
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("Check if method takes in 4 and returns []")
    void checkIfMethodTakesIn4ReturnEmpty() {
        // Arrange
        int testMax = 4;
        HashSet<Integer> expected = new HashSet<>();
        CollectionsTask testHashSet = new CollectionsTask();
        HashSet<Integer> actual = testHashSet.makeFiveSet(testMax);
        // Act
        // Assert
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("Check if the method takes in hello1 and returns hello1")
    void checkIfMethodIsReturnOneValueCorrectly() {
        // Arrange
        String string = "hello1";
        ArrayList<String> expected = new ArrayList<>( Arrays.asList(string));
        CollectionsTask testHashSet = new CollectionsTask();
        List<String> actual = testHashSet.longWordList(string);
        // Act
        // Assert
        Assertions.assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("Check if the method takes in hi and returns empty")
    void checkIfMethodTakes2LetterWordReturnEmptyArrayList() {
        // Arrange
        String string = "hi";
        ArrayList<String> expected = new ArrayList<>( Arrays.asList());
        CollectionsTask testArrayList = new CollectionsTask();
        List<String> actual = testArrayList.longWordList(string);
        // Act
        // Assert
        Assertions.assertEquals(expected, actual);
    }
}
