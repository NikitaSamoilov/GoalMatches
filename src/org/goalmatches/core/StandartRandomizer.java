package org.goalmatches.core;



public class StandartRandomizer extends Randomizer {

    public StandartRandomizer(int minValue, int maxValue) {
        super(minValue, maxValue);
    }

    @Override
    public int getRandomValue() {
        return getMinValue() + (int)(Math.random() * getMaxValue());
    }
}
