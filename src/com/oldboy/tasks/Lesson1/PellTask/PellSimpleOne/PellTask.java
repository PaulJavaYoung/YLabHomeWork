package com.oldboy.tasks.Lesson1.PellTask.PellSimpleOne;

import java.util.Scanner;

public class PellTask {
    public static void main(String[] args) {
        try (Scanner myScan = new Scanner(System.in)){
            System.out.println("Ввод: ");

            int indexPellNumber = myScan.nextInt();

            double minuend = 1 + Math.sqrt(2); // Расчет уменьшаемого
            double deductible = 1 - Math.sqrt(2); // Расчет вычитаемого
            double divider = 2 * Math.sqrt(2); // Расчет делителя
            /* Расчет числя Пелля по формуле */
            double pellNumber = ((Math.pow(minuend, indexPellNumber) -
                                  Math.pow(deductible, indexPellNumber))/divider);

            System.out.printf("Вывод: \n%.0f",pellNumber);
        }
    }
}
