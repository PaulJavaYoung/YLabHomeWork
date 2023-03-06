package com.oldboy.tasks.Lesson1.Guess;

import java.util.Random;
import java.util.Scanner;

public class GuessTaskVerTwo {

    private static final int hiddenNumber = new Random().nextInt(99) + 1;
    private static final int maxAttempts = 10;

    public static void main(String[] args) {

        System.out.printf("Я загадал число от 1 до 99. " +
                          "У вас %d попыток угадать.\n", maxAttempts);

        try(Scanner myScan = new Scanner(System.in)){
            for (var i = 1; i <= maxAttempts; i++){

                int backCount = maxAttempts - i; // Обратный отсчет
                String answer = "У вас " + backCount + " попыток."; // Осталось попыток

                int myAttempt = myScan.nextInt();

                if (myAttempt > hiddenNumber) {
                        System.out.println("Мое число меньше! " + answer);
                        didNotGuess(backCount);
                } else if (myAttempt < hiddenNumber) {
                        System.out.println("Мое число больше! " + answer);
                        didNotGuess(backCount);
                } else {
                    System.out.printf("Вы угадали с %d попытки! ", i);
                    break;
                }
            }
        }
    }
    private static void didNotGuess(int backCount){
        if (backCount == 0){
            System.out.println("Вы не угадали.");
        }
    }
}

