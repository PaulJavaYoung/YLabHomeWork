package com.oldboy.tasks.Lesson2.StatsAccumulator;

import com.oldboy.tasks.Lesson2.StatsAccumulator.InterfaceAndClasses.StatsAccumulator;
import com.oldboy.tasks.Lesson2.StatsAccumulator.InterfaceAndClasses.StatsAccumulatorImpl;

public class StatsAccumulatorTest {
    public static void main(String[] args) {
        StatsAccumulator sa = new StatsAccumulatorImpl();

        System.out.println("Проверка работы на входных данных из примера: ");
        sa.add(1);
        sa.add(2);
        System.out.println(sa.getAvg());
        sa.add(0);
        System.out.println(sa.getMin());
        sa.add(3);
        sa.add(8);
        System.out.println(sa.getMax());
        System.out.println(sa.getCount());
        System.out.println("\nПроверка работы продолжение: ");
        sa.add(6);
        sa.add(2);
        sa.add(13);
        sa.add(-12);
        printStatData(sa);
        sa.add(3);
        sa.add(-15);
        sa.add(124);
        sa.add(231);
        printStatData(sa);
        sa.add(15);
        sa.add(62);
        sa.add(-24);
        sa.add(121);
        printStatData(sa);
        sa.add(38);
        sa.add(-122);
        sa.add(53);
        sa.add(182);
        printStatData(sa);

    }
    private static void printStatData(StatsAccumulator sa){
        System.out.println("Количество переданных элементов: " + sa.getCount());
        System.out.println("Среднее арифметическое: " + sa.getAvg());
        System.out.println("Максимальное из переданных: " + sa.getMax());
        System.out.println("Минимальное из переданных элементов: " + sa.getMin());
        System.out.println("---------------------------------------------------------");
    }
}
