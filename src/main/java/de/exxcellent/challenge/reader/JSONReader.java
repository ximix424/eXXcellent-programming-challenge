package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.dto.FootballTeam;
import de.exxcellent.challenge.dto.WeatherDay;

import java.util.Collections;
import java.util.List;

/**
 * Concrete class to read JSON files
 */
public class JSONReader extends Reader {

    @Override
    public List<FootballTeam> readFootballFile(String path) {
        return Collections.emptyList();
    }

    @Override
    public List<WeatherDay> readWeatherFile(String path) {
        return Collections.emptyList();
    }
}
