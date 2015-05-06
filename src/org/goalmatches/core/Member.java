package org.goalmatches.core;


import java.util.ArrayList;
import java.util.List;

public class Member {
    private String name;
    private Match currentValue;
    private List<Integer> historyPush = new ArrayList<Integer>();
    private List<Integer> historyPop = new ArrayList<Integer>();

    public Member() {
        currentValue = new Match();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Match getCurrentValue() {
        return currentValue;
    }

    public void pushValue(int count) {
        currentValue.increaseValue(count);
        historyPush.add(count);
    }

    public void popValue(int count) {
        if (currentValue.getValue() < count) {
            historyPop.add((currentValue.getValue()));
            currentValue.setValue(0);
        } else {
            currentValue.decreaseValue(count);
            historyPop.add(count);
        }
    }
}
