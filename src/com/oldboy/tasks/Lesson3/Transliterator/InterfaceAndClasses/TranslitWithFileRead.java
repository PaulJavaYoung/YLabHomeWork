package com.oldboy.tasks.Lesson3.Transliterator.InterfaceAndClasses;

import java.util.Map;

public class TranslitWithFileRead implements Transliterator{
    // Словарь соответствия символов кириллицы и латиницы
    private Map<Character, String> translitDict = new ReadFile().readDict();
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
