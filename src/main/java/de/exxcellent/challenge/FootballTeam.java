package de.exxcellent.challenge;

import com.opencsv.bean.CsvBindByName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class FootballTeam {

    @CsvBindByName(column = "Team")
    private String team;

    @CsvBindByName(column = "Goals")
    private int goals;

    @CsvBindByName(column = "Goals Allowed")
    private int goalsAllowed;


    public int compareValues() {
        return Math.abs(goals-goalsAllowed);
    }

    public String getTeam() {
        return team;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
