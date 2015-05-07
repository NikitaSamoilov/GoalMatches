package org.goalmatches.core;

public class Match {
    protected int value = 0;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void increaseValue(int delta) {
        value += delta;
    }

    public void decreaseValue(int delta) {
        value -= delta;
    }

    public Match() {
        //
    }

    public Match(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
