package com.sparta.aa.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Leonardo", "Donatello", "Michelangelo", "Raphael"));

        Collections.sort(names);
        System.out.println(names);

        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person("Adam", "Alrasi"));
        people.add(new Person("Mahad", "Abukar"));

        Collections.sort(people, new PersonComparator());
        System.out.println(people);

        // ContainsLetter mapContainer = new ContainsLetter();

        // HashMap message1 = mapContainer.hashMapProgram("The cat in the hat comes back");

        // System.out.println(message1);

        /*

        hashmap =
        {

        "T" = 1;

for loop
        if T true, value++
        if T false, value = 1
        }
        */
            
        // HashMap<Integer, String> spartans = new HashMap<>();
        // spartans.put(1, "Adam");
        // spartans.put(2, "Alex");
        // spartans.put(3, "Joe");

        // System.out.println(spartans.keySet());
        // System.out.println(spartans.values());

        // System.out.println(spartans);

        // List<String> menu = Arrays.asList(
        //         "Classic Burger", "BBQ Chicken Burger", "Spicy Beef Burger", "Veggie Burger",
        //         "Mac & Cheese", "Cod & Chips", "Vegetable Chilli", "Beef Lasagne", "Steak & Ale Pie",
        //         "Hunters Chicken", "Gammon Steak", "8oz Aged Rump", "Mixed Grill");
        // List<String> mealsIFancy = Arrays.asList(
        //         "Roast Lunch", "Chicken Madras", "Cod & Chips", "Vegetable Chilli", "Cottage Pie",
        //         "Steak & Ale Pie", "Beans on Toast", "Classic Burger", "Beef Lasagne");

        //         NavigableSet<String> choice = new TreeSet<>(menu);
        //         choice.retainAll(mealsIFancy);
        //         for(String meal: choice.descendingSet()){
        //             System.out.println(meal);
        //         }

        // HashSet<String> names = new HashSet<>(
        // List.of("Terry", "Karen", "Fred", "Jimmy", "Brenda")
        // );

        // HashSet<String> moreNames = new HashSet<>(
        // List.of("Carol", "Bredna", "Jeffrey", "Albert", "Terry")
        // );

        // HashSet<String> allNames = new HashSet<>();

        // allNames.addAll(names);
        // allNames.addAll(moreNames);
        // System.out.println(allNames);

        // for(String name: names){
        // System.out.println(name);
        // }

        // names.add("Fred");
        // System.out.println(names);

        // int[] numbers = {5, 6, 3, 2, 1};
        // for(int num: numbers){
        // System.out.print(num + " ");
        // }
        // System.out.println("");
        // numbers[2] = 6;
        // for(int num: numbers){
        // System.out.print(num + " ");
        // }
        // System.out.println("");

        // ArrayList<String> names = new ArrayList<>();
        // names.add("Terry");
        // names.add("Karen");
        // names.add("Bernard");
        // names.add("Jimmy");
        // names.add("Brenda");

        // for(String name: names){
        // System.out.print(name + " ");
        // }
        // System.out.println("");

        // HashMap<String, Integer> months = new HashMap();
        // months.put("January",31);
        // months.put("February",28);
        // months.put("March",31);
        // months.put("April",30);
        // months.put("May",31);
        // months.put("June",30);
        // months.put("July",31);
        // months.put("August",31);
        // months.put("September",30);
        // months.put("October",31);
        // months.put("November",30);
        // months.put("December",31);

        // System.out.println("February: " + months.get("February"));
        // months.put("February", 29);
        // System.out.println("February: " + months.get("February"));
    }
}
