package com.oldboy.tasks.Lesson3.DatedMap;

import com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses.DateMapHard;
import com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses.DatedMap;

public class DMapHardDemoApp {
    public static void main(String[] args) {
        System.out.println("Программа запущена: идет циклическая перезапись данных, ждите!");

        DatedMap testHardMap = new DateMapHard();

        // Тестируем метод *.put() перезаписью элементов и сменой даты
        long finishTime = 0;
        for (int i = 1; i <= 5; i++) {
            long startTime = System.currentTimeMillis();
            while (finishTime - startTime < 2000) {
            String key = String.valueOf(i);
            var value = "Элемент_" + i;

            testHardMap.put(key,value);

            finishTime = System.currentTimeMillis();
            }
        }

        System.out.println("------ Вывод элементов по ключу ------");
        System.out.println(testHardMap.get("1"));
        System.out.println(testHardMap.get("2"));
        System.out.println(testHardMap.get("3"));
        System.out.println(testHardMap.get("4"));
        System.out.println(testHardMap.get("5"));
        System.out.println(testHardMap.get("6"));
        System.out.println(testHardMap.get("7"));

        System.out.println("\n------ Есть ли ключ в DatedMap ------");
        System.out.println(testHardMap.containsKey("1"));
        System.out.println(testHardMap.containsKey("2"));
        System.out.println(testHardMap.containsKey("3"));
        System.out.println(testHardMap.containsKey("4"));
        System.out.println(testHardMap.containsKey("5"));
        System.out.println(testHardMap.containsKey("6"));
        System.out.println(testHardMap.containsKey("7"));

        System.out.println("\n------ Список ключей текущей DatedMap ------");
        System.out.println(testHardMap.keySet());

        System.out.println("\n------ Дата последнего изменения данных по ключам ------");
        System.out.println(testHardMap.getKeyLastInsertionDate("1"));
        System.out.println(testHardMap.getKeyLastInsertionDate("2"));
        System.out.println(testHardMap.getKeyLastInsertionDate("3"));
        System.out.println(testHardMap.getKeyLastInsertionDate("4"));
        System.out.println(testHardMap.getKeyLastInsertionDate("5"));
        System.out.println(testHardMap.getKeyLastInsertionDate("6"));
        System.out.println(testHardMap.getKeyLastInsertionDate("7"));

        System.out.println("\n------ Дата последнего изменения данных по ключу 1 после перезаписи ------");
        testHardMap.put("1","Изменил дату");
        System.out.println(testHardMap.get("1"));
        System.out.println(testHardMap.getKeyLastInsertionDate("1"));

        System.out.println("\n------ Тест метода *.remove() удаление элемента с ключом 1 ------");
        testHardMap.remove("1");
        System.out.println("Существует ли ключ 1: " + testHardMap.containsKey("1"));
        System.out.println("Данные по ключу 1: " + testHardMap.get("1"));
        System.out.println("Дата последнего изменения под ключом 1: " + testHardMap.getKeyLastInsertionDate("1"));

        System.out.println("\n------ Список ключей текущей DatedMap ------");
        System.out.println(testHardMap.keySet());
    }
}