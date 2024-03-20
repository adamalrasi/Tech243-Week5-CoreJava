package com.sparta.aa.exceptions;

import java.text.ParseException;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class AnimalTests {
    @Test
    public void checkThatTheDOBCanBeSet(){
        Animal testAnimal = new Animal();
        Assertions.assertThrows(Error.class, () -> testAnimal.setDob("ooo"));
        
    }
}
