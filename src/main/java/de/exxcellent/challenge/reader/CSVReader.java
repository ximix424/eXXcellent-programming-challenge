package de.exxcellent.challenge.reader;

import com.opencsv.bean.CsvToBeanBuilder;
import de.exxcellent.challenge.dto.FootballTeam;
import de.exxcellent.challenge.dto.WeatherDay;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;

/**
 * Concrete class to read CSV files
 */
public class CSVReader extends Reader {

    @Override
    public List<FootballTeam> readFootballFile(String path) {
        InputStream is = Objects.requireNonNull(getClass().getResourceAsStream(path));
        return new CsvToBeanBuilder<FootballTeam>(new InputStreamReader(is))
                .withType(FootballTeam.class)
                .build()
                .parse();
    }

    @Override
    public List<WeatherDay> readWeatherFile(String path) {
        InputStream is = Objects.requireNonNull(getClass().getResourceAsStream(path));
        return new CsvToBeanBuilder<WeatherDay>(new InputStreamReader(is))
                .withType(WeatherDay.class)
                .build()
                .parse();
    }
}
