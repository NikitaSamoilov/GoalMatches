package org.goalmatches.core;


public class ConstSupply extends Supply {

    protected Match supplyValue;

    public Match getSupplyValue() {
        return supplyValue;
    }

    public ConstSupply(int value) {
        supplyValue = new Match(value);
    }

    @Override
    public int getNextValue() {
        return supplyValue.getValue();
    }
}
