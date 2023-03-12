package com.oldboy.tasks.Lesson2.ComplexNumbers;

public class ComplexNumberTest {
    public static void main(String[] args) {

        // Создаем ссылку на комплексное число z1 = -1 + 2i;
        ComplexNumber z1 = new ComplexNumber(-1, 2);
        System.out.println("Комплексное число z1: \n" + z1);
        // Создаем ссылку на комплексное число z2 = 2 - 3i;
        ComplexNumber z2 = new ComplexNumber(2, -3);
        System.out.println("Комплексное число z2: \n" + z2);

        ComplexNumber z3 = z1.sum(z2);
        System.out.println("\nСумма z3 = z1 + z2: \n" + z3);
        System.out.println("Модуль z3: " + z3.modulus());

        ComplexNumber z4 = z1.subtract(z2);
        System.out.println("\nРазность z4 = z1 - z2: \n" + z4);
        System.out.println("Модуль z4: " + z4.modulus());

        ComplexNumber z5 = z1.multiply(z2);
        System.out.println("\nПроизведение z5 = z1 * z2: \n" + z5);
        System.out.println("Модуль z5: " + z5.modulus());

        /*
        Создаем ссылку на комплексное число z6 = -3, используем
        конструктор с одним параметром.
        */
        ComplexNumber z6 = new ComplexNumber(-3);
        System.out.println("\nКомплексное число z6: \n" + z6);

    }
}
