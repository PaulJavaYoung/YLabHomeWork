package com.oldboy.tasks.Lesson2.RateLimitedPrinter;

public class RateLimitedPrinter {
    private int interval;
    private long finishPrintTime;

    public RateLimitedPrinter(int interval) {
        this.interval = interval;
        this.finishPrintTime = 0;
    }

    public void print(String message) {
        long startPrintTime = System.currentTimeMillis();
        if ((startPrintTime - finishPrintTime) > interval){
            System.out.println(message);
            finishPrintTime = startPrintTime;
        }
    }
}