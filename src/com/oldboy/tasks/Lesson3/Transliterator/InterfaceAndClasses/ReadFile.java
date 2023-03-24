package com.oldboy.tasks.Lesson3.Transliterator.InterfaceAndClasses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFile {
    private String file_for_read = "src\\com\\oldboy\\tasks\\Lesson3\\Transliterator\\Dictionary\\newdict.txt";
    private Map<Character, String> dictionary = new HashMap<>();

    public Map<Character, String> readDict() {

        try (BufferedReader br = new BufferedReader(new FileReader(file_for_read))) {
            String str;
            while ((str = br.readLine()) != null) {
                Character key = str.split(",")[0].charAt(0);
                String value = str.split(",")[1].replaceAll("'", "");
                dictionary.put(key, value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return dictionary;
    }
}