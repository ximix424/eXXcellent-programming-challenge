package de.exxcellent.challenge.reader;

import de.exxcellent.challenge.dto.FootballTeam;
import de.exxcellent.challenge.dto.WeatherDay;

import java.util.List;

/**
 * Abstract Reader class with template methods
 */
public abstract class Reader {

    public abstract List<FootballTeam> readFootballFile(String path);

    public abstract List<WeatherDay> readWeatherFile(String path);

}
