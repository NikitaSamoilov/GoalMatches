package org.goalmatches.core;


public abstract class Randomizer {
    private int minValue;
    private int maxValue;

    public int getMaxValue() {
        return maxValue;
    }

    public int getMinValue() {
        return minValue;
    }

    public Randomizer(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public abstract int getRandomValue();
}
