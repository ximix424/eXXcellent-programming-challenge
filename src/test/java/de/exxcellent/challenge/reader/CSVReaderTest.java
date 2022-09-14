package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.dto.FootballTeam;
import de.exxcellent.challenge.dto.WeatherDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the CSVReader class
 */
class CSVReaderTest {

    private final Reader reader = new CSVReader();

    /**
     * Reads the Weather CSV file
     */
    @Test
    void test_readWeatherFile() {
        //
        // GIVEN
        //
        String csvPath = "/de/exxcellent/challenge/weather.csv";
        WeatherDay mockedFootballTeam = new WeatherDay(1, 88, 59);

        //
        // WHEN
        //
        WeatherDay result = reader.readWeatherFile(csvPath).get(0);

        //
        // THEN
        //
        assertEquals(result.getDayId(), mockedFootballTeam.getDayId());
        assertEquals(result.getMaxTemp(), mockedFootballTeam.getMaxTemp());
        assertEquals(result.getMinTemp(), mockedFootballTeam.getMinTemp());
    }

    /**
     * Reads the Football CSV file
     */
    @Test
    void test_readFootBallFile() {
        //
        // GIVEN
        //
        String csvPath = "/de/exxcellent/challenge/football.csv";
        FootballTeam mockedFootballTeam = new FootballTeam("Arsenal", 79, 36);

        //
        // WHEN
        //
        FootballTeam result = reader.readFootballFile(csvPath).get(0);

        //
        // THEN
        //
        assertEquals(result.getTeam(), mockedFootballTeam.getTeam());
        assertEquals(result.getGoals(), mockedFootballTeam.getGoals());
        assertEquals(result.getGoalsAllowed(), mockedFootballTeam.getGoalsAllowed());
    }

}