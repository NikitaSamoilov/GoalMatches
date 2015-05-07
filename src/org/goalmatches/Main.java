package org.goalmatches;

import org.goalmatches.core.*;

import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Supply supply = new ConstSupply(4);
        Shipping shipping = new Shipping();
        Randomizer randomizer = new StandartRandomizer(1, 7);
        List<Member> memberList = new ArrayList<Member>();
        for (int i = 0; i < 16; i++) {
            Member member = new Member();
            member.setName("Member # " + String.valueOf(i + 1));
            memberList.add(member);
        }

        Circuit circuit = new Circuit();
        circuit.setMembers(memberList);
        circuit.setShipping(shipping);
        circuit.setRandomizer(randomizer);
        circuit.setSupply(supply);

        for (int i = 0; i < 100; i++) {
            circuit.makeIteration();
        }

        System.out.println(circuit.getReport());
    }
}
