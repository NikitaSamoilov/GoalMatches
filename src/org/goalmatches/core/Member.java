package org.goalmatches.core;


public class Member {
    private String name;
    private int currentValue;

    public String getName() {
        return name;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void pushValue(int count) {
        currentValue += count;
    }

    public void popValue(int count) {
        if (currentValue < count) {
            currentValue = 0;
        } else {
            currentValue -= count;
        }


    }
}
