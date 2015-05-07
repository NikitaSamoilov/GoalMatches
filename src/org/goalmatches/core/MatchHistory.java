package org.goalmatches.core;

import java.awt.*;
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

}
