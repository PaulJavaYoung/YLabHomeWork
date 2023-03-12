package com.oldboy.tasks.Lesson2.SnilsValidator;
/*
В качестве тестовых строк
можно использовать:
- для true:
16675209900
12602903624
94488355367
53563532491

- для false:
24851647932
21147893480
fgtx134cy6h

и т.д. не соответствующие требования
валидности СНИЛС строки.
*/

import com.oldboy.tasks.Lesson2.SnilsValidator.InterfaceAndClasses.SnilsValidator;
import com.oldboy.tasks.Lesson2.SnilsValidator.InterfaceAndClasses.SnilsValidatorImpl;

import java.util.Scanner;

public class SnilsValidTester {
    public static void main(String[] args) {
        SnilsValidator svi = new SnilsValidatorImpl();

        System.out.println("Введите данные вашего СНИЛС в формате XXXXXXXXXXX -\n" +
                           "11 цифр без пробелов и дефисов, будьте внимательны:");

        try (Scanner myScan = new Scanner(System.in)) {
            String inputString = myScan.nextLine();
            System.out.println(svi.validate(inputString));
        }
    }
}