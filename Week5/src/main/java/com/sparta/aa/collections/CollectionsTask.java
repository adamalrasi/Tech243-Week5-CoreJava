package com.sparta.aa.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CollectionsTask {
    public static HashSet<Integer> makeFiveSet(int max){
        HashSet<Integer> result = new HashSet<>();

        for(int i = 1; i <= max; i++){
            if(i % 5 == 0){
                result.add(i);
            }
        }

        return result;
    }

    public static List<String>longWordList(String string){
        ArrayList<String> result = new ArrayList<>();

        for(String word: string.split(" ")){
            if(word.length()>=5){
                result.add(word);
            }
        }

        return result;
    }
}
