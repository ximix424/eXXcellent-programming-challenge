package de.exxcellent.challenge.dto;

import com.opencsv.bean.CsvBindByName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FootballTeam {

    @CsvBindByName(column = "Team")
    private String team;

    @CsvBindByName(column = "Goals")
    private int goals;

    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;

    public FootballTeam() {}

    public FootballTeam(String team, int goals, int goalsAllowed) {
        this.team = team;
        this.goals = goals;
        this.goalsAllowed = goalsAllowed;
    }

    public int compareValues() {
        return Math.abs(goals-goalsAllowed);
    }

    public String getTeam() {
        return team;
    }

    public int getGoals() {
        return goals;
    }

    public int getGoalsAllowed() {
        return goalsAllowed;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
