package com.oldboy.tasks.Lesson2.RateLimitedPrinter;

public class RlpTestApp {
    public static void main(String[] args) {
        int timeLimit = 1000; // Переменная задающая длительность задержки
        RateLimitedPrinter rateLimitedPrinter = new RateLimitedPrinter(timeLimit);
        for (int i = 0; i < 1_000_000_000; i++) {
            rateLimitedPrinter.print(String.valueOf(i));
        }
    }
}
