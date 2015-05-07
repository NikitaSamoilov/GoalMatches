package org.goalmatches.core;

import java.util.ArrayList;
import java.util.List;

public class MatchHistory {
    private List<Match> pushHistory = new ArrayList<Match>();
    private List<Match> popHistory = new ArrayList<Match>();


    public List<Match> getPushHistory() {
        return pushHistory;
    }

    public List<Match> getPopHistory() {
        return popHistory;
    }

    public List<Match> calculateBalanceHistory() {
        List<Match> balanceHistory = new ArrayList<Match>();
        int balance = 0;
        for (int i = 0; i < pushHistory.size(); i++) {
            balance += (pushHistory.get(i).getValue() - popHistory.get(i).getValue());
            balanceHistory.add(new Match(balance));
        }

        return balanceHistory;
    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Push History:");
        for (Match match : pushHistory) {
            strBuilder.append(String.format(" %d", match.getValue()));
        }
        strBuilder.append("\nPop History:");
        for (Match match : popHistory) {
            strBuilder.append(String.format(" %d", match.getValue()));
        }

        List<Match> balanceHistory = calculateBalanceHistory();
        strBuilder.append("\nBalance:");
        for (Match match : balanceHistory) {
            strBuilder.append(String.format(" %d", match.getValue()));
        }

        return strBuilder.toString();
    }
}
