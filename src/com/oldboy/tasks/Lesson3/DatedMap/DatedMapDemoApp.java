package com.oldboy.tasks.Lesson3.DatedMap;

import com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses.DateMapImpl;
import com.oldboy.tasks.Lesson3.DatedMap.InterfaceAndClasses.DatedMap;

public class DatedMapDemoApp {
    public static void main(String[] args) {
        System.out.println("Программа запущена: идет циклическая перезапись данных, ждите!");

        DatedMap testMap = new DateMapImpl();

        // Тестируем метод *.put() перезаписью элементов и сменой даты
        long finishTime = 0;
        for (int i = 1; i <= 5; i++) {
            long startTime = System.currentTimeMillis();
            while (finishTime - startTime < 2000) {
            String key = String.valueOf(i);
            var value = "Элемент_" + i;

            testMap.put(key,value);

            finishTime = System.currentTimeMillis();
            }
        }

        System.out.println("------ Вывод элементов по ключу ------");
        System.out.println(testMap.get("1"));
        System.out.println(testMap.get("2"));
        System.out.println(testMap.get("3"));
        System.out.println(testMap.get("4"));
        System.out.println(testMap.get("5"));
        System.out.println(testMap.get("6"));
        System.out.println(testMap.get("7"));

        System.out.println("\n------ Есть ли ключ в DatedMap ------");
        System.out.println(testMap.containsKey("1"));
        System.out.println(testMap.containsKey("2"));
        System.out.println(testMap.containsKey("3"));
        System.out.println(testMap.containsKey("4"));
        System.out.println(testMap.containsKey("5"));
        System.out.println(testMap.containsKey("6"));
        System.out.println(testMap.containsKey("7"));

        System.out.println("\n------ Список ключей текущей DatedMap ------");
        System.out.println(testMap.keySet());

        System.out.println("\n------ Дата последнего изменения данных по ключам ------");
        System.out.println(testMap.getKeyLastInsertionDate("1"));
        System.out.println(testMap.getKeyLastInsertionDate("2"));
        System.out.println(testMap.getKeyLastInsertionDate("3"));
        System.out.println(testMap.getKeyLastInsertionDate("4"));
        System.out.println(testMap.getKeyLastInsertionDate("5"));
        System.out.println(testMap.getKeyLastInsertionDate("6"));
        System.out.println(testMap.getKeyLastInsertionDate("7"));

        System.out.println("\n------ Дата последнего изменения данных по ключу 1 после перезаписи ------");
        testMap.put("1","Изменил дату");
        System.out.println(testMap.get("1"));
        System.out.println(testMap.getKeyLastInsertionDate("1"));

        System.out.println("\n------ Тест метода *.remove() удаление элемента с ключом 1 ------");
        testMap.remove("1");
        System.out.println("Существует ли ключ 1: " + testMap.containsKey("1"));
        System.out.println("Данные по ключу 1: " + testMap.get("1"));
        System.out.println("Дата последнего изменения под ключом 1: " + testMap.getKeyLastInsertionDate("1"));

        System.out.println("\n------ Список ключей текущей DatedMap ------");
        System.out.println(testMap.keySet());
    }
}