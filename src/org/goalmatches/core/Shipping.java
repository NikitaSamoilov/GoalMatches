package org.goalmatches.core;


public class Shipping {
    private int currentvalue;

    public int getValue() {
        return currentvalue;
    }

    public void push(int count) {
        currentvalue += count;
    }
}
