package org.goalmatches.core;

public class RandomSupply extends Supply {

    private Randomizer randomizer;

    public Randomizer getRandomizer() {
        return randomizer;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    @Override
    public int getNextValue() {
        return randomizer.getRandomValue();
    }
}
