package org.goalmatches.core;


import java.util.ArrayList;
import java.util.List;

public class Shipping {
    private Match currentValue;
    private List<Match> deltaHistory = new ArrayList<Match>();

    public Match getValue() {
        return currentValue;
    }

    public Shipping() {
        currentValue = new Match();
    }

    public void push(int count) {
        currentValue.increaseValue(count);
        deltaHistory.add(new Match(count));
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append(String.format("Shipping: %d\nInputs:", currentValue.getValue()));
        for (Match match : deltaHistory) {
            strBuilder.append(String.format(" %d", match.getValue()));
        }
        return strBuilder.toString();
    }
}
