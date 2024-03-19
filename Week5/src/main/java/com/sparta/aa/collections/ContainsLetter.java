package com.sparta.aa.collections;

import java.util.HashMap;

public class ContainsLetter {
    private String message;


    public String convertMessage(String message) {
        return message.toLowerCase().replaceAll("\\s+", "");
    }

    public HashMap hashMapProgram(String message) {
        String convertedMessage = convertMessage(message);
        HashMap<Character, Integer> lettersCount = new HashMap<>();
        for (int i = 0; i < convertedMessage.length(); i++) {
            if (lettersCount.containsKey(convertedMessage.charAt(i))) {
                int val = lettersCount.get(convertedMessage.charAt(i));
                lettersCount.put(convertedMessage.charAt(i), val + 1);
            } else {
                lettersCount.put(convertedMessage.charAt(i), 1);
            }
        }
        return lettersCount;
    }
}
