package org.goalmatches.core;


import java.util.Collection;

public class Circuit {

    protected Supply supply;
    protected Collection<Member> members;
    protected Randomizer randomizer;
    protected Shipping shipping;

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Collection<Member> getMembers() {
        return members;
    }

    public void setMembers(Collection<Member> members) {
        this.members = members;
    }

    public Randomizer getRandomizer() {
        return randomizer;
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public Shipping getShipping() {
        return shipping;
    }

    public void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public String getReport() {
        //TODO: make it right
        StringBuilder strBuilder = new StringBuilder();
        for (Member member : members) {
            strBuilder.append(member.getName());
            strBuilder.append(": ");
            strBuilder.append(member.getCurrentValue());
            strBuilder.append("\n");
            strBuilder.append(member.getHistory().toString());
            strBuilder.append("\n");
        }
        strBuilder.append("Shipping: ");
        strBuilder.append(shipping.getValue());

        return strBuilder.toString();
    }

    public void makeIteration() {
        int val = supply.getNextValue();
        for (Member member : members) {
            val = makeMiniIteration(val, member);
        }
        shipping.push(val);
    }

    private int makeMiniIteration(int val, Member member) {
        member.pushValue(val);
        val = randomizer.getRandomValue();
        member.popValue(val);
        return val;
    }

}
