package de.exxcellent.challenge;

import de.exxcellent.challenge.strategy.FootballSmallestSpread;
import de.exxcellent.challenge.strategy.SmallestSpread;
import de.exxcellent.challenge.strategy.WeatherSmallestSpread;

/**
 * @author Marcel Roth <marcel.roth@exxcellent.de>
 */
public final class App {

    /**
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        SmallestSpread weatherSmallestSpread = new WeatherSmallestSpread();
        String dayWithSmallestTempSpread = weatherSmallestSpread.calculateSmallestSpread();
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        SmallestSpread footballSmallestSpread = new FootballSmallestSpread();
        String teamWithSmallestGoalSpread = footballSmallestSpread.calculateSmallestSpread();
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }
}
