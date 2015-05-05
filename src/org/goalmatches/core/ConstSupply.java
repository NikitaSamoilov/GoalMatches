package org.goalmatches.core;


public class ConstSupply extends Supply {

    protected int supplyValue;

    public int getSupplyValue() {
        return supplyValue;
    }

    @Override
    public int getNextValue() {
        return supplyValue;
    }
}
