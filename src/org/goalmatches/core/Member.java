package org.goalmatches.core;


import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private int currentValue;
    private List<Integer> historyPush = new ArrayList<Integer>();
    private List<Integer> historyPop = new ArrayList<Integer>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public void pushValue(int count) {
        currentValue += count;
        historyPush.add(count);
    }

    public void popValue(int count) {
        if (currentValue < count) {
            currentValue = 0;
            historyPop.add(currentValue);
        } else {
            currentValue -= count;
            historyPop.add(count);
        }
    }
}
