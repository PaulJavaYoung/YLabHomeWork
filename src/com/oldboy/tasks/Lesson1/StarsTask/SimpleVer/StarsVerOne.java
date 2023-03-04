package com.oldboy.tasks.Lesson1.StarsTask.SimpleVer;

import java.util.Scanner;

public class StarsVerOne {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ввод: ");
            int n = scanner.nextInt(); // Количество строк
            int m = scanner.nextInt(); // Количество столбцов
            String template = scanner.next().trim(); // Произвольный символ

            System.out.println("Вывод: ");
            for (int i = 0; i < n; i++) {
                for(int j = 0; j < m; j++) {
                    System.out.print(template + " ");
                }
                System.out.println();
            }
        }
    }
}
