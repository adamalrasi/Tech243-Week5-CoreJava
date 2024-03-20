package com.sparta.aa.exceptions;

import java.nio.charset.IllegalCharsetNameException;
import java.text.ParseException;

public class App {
    public static void main(String[] args) {
        try {
            Animal animal = new Animal();
            animal.setDob("<<<");
        } catch ( Exception e){
            System.out.println("Caught an Expection");
        }
        
       Animal cat = new Animal();
       Animal dog = new Animal("Fido", 10);

       System.out.println(cat.getName());
       System.out.println(dog.getName());

       try {
        dog.setDob("eeee");
       } catch (ParseException | IllegalCharsetNameException e){
        System.out.println("Parse Exception Thrown");
       } finally {
        System.out.println("In Finally Block");
       }
    }
    
}
