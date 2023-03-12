package com.oldboy.tasks.Lesson2.StatsAccumulator.InterfaceAndClasses;

public class StatsAccumulatorImpl implements StatsAccumulator {

    private int count = 0;
    private int min;
    private int max;
    private int sum = 0;

    @Override
    public void add(int value) {
        if (count == 0) {
            min = value;
            max = value;
        } else {
            min = Math.min(min, value);
            max = Math.max(max, value);
        }
        count++;
        sum = sum + value;
    }

    @Override
    public int getMin() {
        return min;
    }

    @Override
    public int getMax() {
        return max;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Double getAvg() {
        return (double) sum / count;
    }
}
