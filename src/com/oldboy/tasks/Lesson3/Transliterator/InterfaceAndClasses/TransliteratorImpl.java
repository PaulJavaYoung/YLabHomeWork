package com.oldboy.tasks.Lesson3.Transliterator.InterfaceAndClasses;

import java.util.HashMap;
import java.util.Map;

public class TransliteratorImpl implements Transliterator{
    private static Map<Character, String> translitDict = new HashMap<>();

    static {
        translitDict.put('А', "A");
        translitDict.put('Б', "B");
        translitDict.put('В', "V");
        translitDict.put('Г', "G");
        translitDict.put('Д', "D");
        translitDict.put('Е', "E");
        translitDict.put('Ё', "E");
        translitDict.put('Ж', "ZH");
        translitDict.put('З', "Z");
        translitDict.put('И', "I");
        translitDict.put('Й', "I");
        translitDict.put('К', "K");
        translitDict.put('Л', "L");
        translitDict.put('М', "M");
        translitDict.put('Н', "N");
        translitDict.put('О', "O");
        translitDict.put('П', "P");
        translitDict.put('Р', "R");
        translitDict.put('С', "S");
        translitDict.put('Т', "T");
        translitDict.put('У', "U");
        translitDict.put('Ф', "F");
        translitDict.put('Х', "KH");
        translitDict.put('Ц', "TS");
        translitDict.put('Ч', "CH");
        translitDict.put('Ш', "SH");
        translitDict.put('Щ', "SHCH");
        translitDict.put('Ъ', "IE");
        translitDict.put('Ы', "Y");
        translitDict.put('Ь', "");
        translitDict.put('Э', "E");
        translitDict.put('Ю', "IU");
        translitDict.put('Я', "IA");
    }
    @Override
    public String transliterate(String source) {
        StringBuilder outputStr = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            char c = source.charAt(i);
            if (translitDict.containsKey(c)) {
                // Если символ кириллицы есть в словаре, заменяем его на соответствующую латиницу
                outputStr.append(translitDict.get(c));
            } else {
                // Если символ не кириллица, оставляем его без изменений
                outputStr.append(c);
            }
        }
        return outputStr.toString();
    }
}
