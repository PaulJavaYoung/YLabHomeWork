package com.oldboy.tasks.Lesson1.PellTask.PellWithArray;

import java.util.Scanner;

public class PellWithArray {
    private static final int[] pellNumber = new int[31];

    static {
        pellNumber[0] = 0;
        pellNumber[1] = 1;
        for (int i = 2; i < pellNumber.length; i++){
            pellNumber[i] = 2 * pellNumber[i-1] + pellNumber[i - 2];
        }
    }

    public static void main(String[] args) {
        int receivedId = userConsoleUI();
        System.out.printf("Вывод: \n%d",pellNumber[receivedId]);
    }

    private static int userConsoleUI(){
        try (Scanner myScan = new Scanner(System.in)){
            System.out.println("Введите число от 0 до 30:");
            return myScan.nextInt();
        }
    }
}
