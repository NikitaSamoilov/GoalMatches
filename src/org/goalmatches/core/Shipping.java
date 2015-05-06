package org.goalmatches.core;


public class Shipping {
    private Match currentValue;

    public Match getValue() {
        return currentValue;
    }

    public Shipping() {
        currentValue = new Match();
    }

    public void push(int count) {
        currentValue.increaseValue(count);
    }
}
