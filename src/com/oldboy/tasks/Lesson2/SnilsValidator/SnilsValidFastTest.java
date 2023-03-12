package com.oldboy.tasks.Lesson2.SnilsValidator;

import com.oldboy.tasks.Lesson2.SnilsValidator.InterfaceAndClasses.SnilsValidator;
import com.oldboy.tasks.Lesson2.SnilsValidator.InterfaceAndClasses.SnilsValidatorImpl;

public class SnilsValidFastTest {
    public static void main(String[] args) {
        SnilsValidator svi = new SnilsValidatorImpl();

        System.out.println("Валидные СНИЛС: ");
        System.out.println(svi.validate("16675209900"));
        System.out.println(svi.validate("12602903624"));
        System.out.println(svi.validate("94488355367"));
        System.out.println(svi.validate("53563532491"));

        System.out.println("\nНе валидные СНИЛС и 'мусор': ");
        System.out.println(svi.validate("75209900"));
        System.out.println(svi.validate("фыуаца900"));
        System.out.println(svi.validate("213546254635735673657365"));
        System.out.println(svi.validate("sfdbshrwthetht246thet"));
        System.out.println(svi.validate(""));
        System.out.println(svi.validate("45779651243"));
    }
}