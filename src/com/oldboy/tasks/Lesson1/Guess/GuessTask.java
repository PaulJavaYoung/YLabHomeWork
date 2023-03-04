package com.oldboy.tasks.Lesson1.Guess;

import java.util.Random;
import java.util.Scanner;

public class GuessTask {
    public static void main(String[] args) {

            int hiddenNumber = new Random().nextInt(99) + 1;
            int maxAttempts = 10;
            int attemptsCounter = 0;

            System.out.println("Я загадал число от 1 до 99. " +
                               "У вас " + maxAttempts + " попыток угадать.");
            try(Scanner myScan = new Scanner(System.in)){
                while (maxAttempts > 0){
                    int myAttempt = myScan.nextInt();
                    attemptsCounter++;
                    if (myAttempt == hiddenNumber){
                        System.out.printf("Вы угадали с %d попытки! ", attemptsCounter);
                        break;
                    } else {
                        maxAttempts--;
                        if (myAttempt > hiddenNumber && maxAttempts > 0){
                            System.out.println("Мое число меньше! " +
                                               "У вас " + maxAttempts + " попыток.");
                        } else if (myAttempt < hiddenNumber && maxAttempts > 0){
                            System.out.println("Мое число больше! " +
                                               "У вас " + maxAttempts + " попыток.");
                        } else {
                            String lastAttempt = (myAttempt > hiddenNumber) ?
                                    "Мое число меньше! У вас " + maxAttempts + " попыток.\nВы не угадали." :
                                    "Мое число больше! У вас " + maxAttempts + " попыток.\nВы не угадали.";
                            System.out.println(lastAttempt);
                        }
                    }
                }
            }
    }
}
