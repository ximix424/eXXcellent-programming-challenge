package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.dto.FootballTeam;
import de.exxcellent.challenge.dto.WeatherDay;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Tests the JSONReader class
 */
class JSONReaderTest {

    private final Reader reader = new JSONReader();

    /**
     * Reads the Weather JSON file
     */
    @Test
    void test_readWeatherFile() {
        //
        // GIVEN
        //
        String jsonPath = "/de/exxcellent/challenge/XX";

        //
        // WHEN
        //
        List<WeatherDay> result = reader.readWeatherFile(jsonPath);

        //
        // THEN
        //
        assert(result.isEmpty());
    }

    /**
     * Reads the Football JSON file
     */
    @Test
    void test_readFootBallFile() {
        //
        // GIVEN
        //
        String jsonPath = "/de/exxcellent/challenge/XX";

        //
        // WHEN
        //
        List<FootballTeam> result = reader.readFootballFile(jsonPath);

        //
        // THEN
        //
        assert(result.isEmpty());
    }

}