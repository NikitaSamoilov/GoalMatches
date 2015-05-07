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

        return strBuilder.toString();
    }
}
