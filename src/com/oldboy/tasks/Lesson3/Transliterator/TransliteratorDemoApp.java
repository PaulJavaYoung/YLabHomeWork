package com.oldboy.tasks.Lesson3.Transliterator;

import com.oldboy.tasks.Lesson3.Transliterator.InterfaceAndClasses.*;

public class TransliteratorDemoApp {
    public static void main(String[] args) {
        System.out.println("----------------------- Тест простого 'Транслитератора' -----------------------");
        Transliterator simpleTrans = new TransliteratorImpl();
        String strForTranslit = "HELLO! ПРИВЕТ! Go, boy!";
        System.out.println(simpleTrans.transliterate(strForTranslit));

        String test_1 = "ХОЧЕШЬ БУЛОЧКУ? My little pussy МУРКА!";
        System.out.println(simpleTrans.transliterate(test_1));

        String test_2 = "WHAT DO YOU ХОЧЕШЬ? ХОЧЕШ СЛАДКИХ ORANGES?!";
        System.out.println(simpleTrans.transliterate(test_2));


        System.out.println("\n----------------- Тест 'Транслитератора' загружающего словарь -----------------");
        Transliterator myTrans = new TranslitWithFileRead();
        String strForTranslit_2 = "HELLO! ПРИВЕТ! Go, boy!";
        System.out.println(myTrans.transliterate(strForTranslit_2));

        String test_one = "ХОЧЕШЬ БУЛОЧКУ? My little pussy МУРКА!";
        System.out.println(myTrans.transliterate(test_one));

        String test_two = "WHAT DO YOU ХОЧЕШЬ? ХОЧЕШ СЛАДКИХ ORANGES?!";
        System.out.println(myTrans.transliterate(test_two));
    }
}