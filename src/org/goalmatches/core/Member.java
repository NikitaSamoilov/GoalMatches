package org.goalmatches.core;



public class Member {
    private String name;
    private Match currentValue;
    private MatchHistory history;

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

    public MatchHistory getHistory() {
        return history;
    }

    public void pushValue(int count) {
        currentValue.increaseValue(count);
        history.getPushHistory().add(new Match(count));
    }

    public void popValue(int count) {
        if (currentValue.getValue() < count) {
            history.getPopHistory().add(new Match(currentValue.getValue()));
            currentValue.setValue(0);
        } else {
            currentValue.decreaseValue(count);
            history.getPopHistory().add(new Match(count));
        }
    }
}
