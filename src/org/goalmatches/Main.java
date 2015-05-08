package org.goalmatches;

import org.goalmatches.core.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int shippingsValue = 0;
        for (int i = 0; i < 1000; i++) {
            Circuit circuit = makeIteration(10, 1);
            shippingsValue += circuit.getShipping().getValue().getValue(); //TODO: idiotism -> remake
            //System.out.println(circuit.getReport());
        }
        System.out.println(String.format("Shippings: %d", shippingsValue));
    }

    private static Circuit makeIteration(int memberCount, int iterationCount) {
        Shipping shipping = new Shipping();
        Randomizer randomizer = new StandartRandomizer(1, 7);
        //Supply supply = getConstSupply();
        Supply supply = getRandomSupply(randomizer);
        List<Member> memberList = new ArrayList<Member>();
        for (int i = 0; i < memberCount; i++) {
            Member member = new Member();
            member.setName("Member # " + String.valueOf(i + 1));
            memberList.add(member);
        }

        Circuit circuit = new Circuit();
        circuit.setMembers(memberList);
        circuit.setShipping(shipping);
        circuit.setRandomizer(randomizer);
        circuit.setSupply(supply);

        for (int i = 0; i < iterationCount; i++) {
            circuit.makeIteration();
        }

        return circuit;
    }

    private static ConstSupply getConstSupply() {
        ConstSupply supply = new ConstSupply();
        supply.setSupplyValue(4);

        return supply;
    }

    private static RandomSupply getRandomSupply(Randomizer randomizer) {
        RandomSupply supply = new RandomSupply();
        supply.setRandomizer(randomizer);

        return supply;
    }
}
