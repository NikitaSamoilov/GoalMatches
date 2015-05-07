package org.goalmatches.core;


public class ConstSupply extends Supply {

    protected Match supplyValue;

    public Match getSupplyValue() {
        return supplyValue;
    }

    public void setSupplyValue(int value) {
        supplyValue.setValue(value);
    }

    public ConstSupply() {
        supplyValue = new Match();
    }

    @Override
    public int getNextValue() {
        return supplyValue.getValue();
    }
}
