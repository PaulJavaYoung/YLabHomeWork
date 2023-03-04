package com.oldboy.tasks.Lesson1.StarsTask.OneStringInVer;

import java.util.Scanner;

public class StarSingleStrVer {
    public static void main(String[] args) {
        String splitStr = consoleUI();
        System.out.println("Вывод: ");
        resultToDisplay(splitStr);
    }

    private static String consoleUI(){
        try(Scanner myScan = new Scanner(System.in)){
            System.out.println("Введите через пробел три параметра - две цифры и символ, " +
                    "например: 2 3 $. \nГде 2 - количество строк, 3 - количество " +
                    "столбцов, $ - произвольный символ.\n\nВведите запрошенные данные:");
            return myScan.nextLine().trim();
        }
    }

    private static void resultToDisplay(String inputStr){
        String[] splitStringArray = inputStr.split("\\s+");
        int n = Integer.parseInt(splitStringArray[0]); // Количество строк
        int m = Integer.parseInt(splitStringArray[1]); // Количество столбцов
        String template = splitStringArray[2]; // Произвольный символ
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(template + " ");
            }
            System.out.println();
        }
    }
}
