package de.exxcellent.challenge.strategy;

import de.exxcellent.challenge.dto.FootballTeam;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static de.exxcellent.challenge.App.reader;

/**
 * Concrete strategy. Implements the smallest Football spread method.
 */
public class FootballSmallestSpread implements SmallestSpread {

    private final List<FootballTeam> footballTeams = reader.readFootballFile("/de/exxcellent/challenge/football.csv");

    /**
     * Calculate smallest spread.
     */
    @Override
    public String calculateSmallestSpread() {
        List<Integer> teamDifferences = footballTeams.stream()
                .map(FootballTeam::compareValues)
                .mapToInt(Integer::intValue)
                .boxed()    // int -> Integer conversion
                .collect(Collectors.toList());

        return IntStream.range(0, teamDifferences.size())
                .boxed()
                .min(Comparator.comparing(teamDifferences::get))
                .map(integer -> footballTeams.get(integer).getTeam()).orElse("Football Team not found");
    }
}
