package de.exxcellent.challenge;

import com.opencsv.bean.CsvToBeanBuilder;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author Marcel Roth <marcel.roth@exxcellent.de>
 */
public final class App {

    /**
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        String dayWithSmallestTempSpread = calcDayWithSmallestTempSpread();     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = calcTeamWithSmallestGoalSpread(); // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

    /**
     * Calculates the day with the smallest temperature spread
     *
     * @return the day
     */
    private static String calcDayWithSmallestTempSpread() {
        String weatherCsvPath = "/de/exxcellent/challenge/weather.csv";
        InputStream is = Objects.requireNonNull(App.class.getResourceAsStream(weatherCsvPath));

        List<WeatherDay> weatherDays = new CsvToBeanBuilder<WeatherDay>(new InputStreamReader(is))
                .withType(WeatherDay.class)
                .build()
                .parse();

        List<Integer> tempDifferences = weatherDays.stream()
                .map(WeatherDay::compareValues)
                .mapToInt(Integer::intValue)
                .boxed()    // int -> Integer conversion
                .collect(Collectors.toList());
        System.out.println(tempDifferences);

        return IntStream.range(0, tempDifferences.size())
                .boxed()
                .min(Comparator.comparing(tempDifferences::get))
                .map(integer -> String.valueOf(weatherDays.get(integer).getDayId())).orElse("Temperature not found");
    }

    /**
     * Calculates the team with the smallest goal spread
     *
     * @return the goal
     */
    private static String calcTeamWithSmallestGoalSpread() {
        String weatherCsvPath = "/de/exxcellent/challenge/football.csv";
        InputStream is = Objects.requireNonNull(App.class.getResourceAsStream(weatherCsvPath));

        List<FootballTeam> footballTeams = new CsvToBeanBuilder<FootballTeam>(new InputStreamReader(is))
                .withType(FootballTeam.class)
                .build()
                .parse();

        List<Integer> teamDifferences = footballTeams.stream()
                .map(FootballTeam::compareValues)
                .mapToInt(Integer::intValue)
                .boxed()    // int -> Integer conversion
                .collect(Collectors.toList());
        System.out.println(teamDifferences);

        return IntStream.range(0, teamDifferences.size())
                .boxed()
                .min(Comparator.comparing(teamDifferences::get))
                .map(integer -> footballTeams.get(integer).getTeam()).orElse("Team not found");
    }

}
