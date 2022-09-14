package de.exxcellent.challenge.strategy;

import de.exxcellent.challenge.dto.WeatherDay;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static de.exxcellent.challenge.App.reader;

/**
 * Concrete strategy. Implements the smallest Weather spread method.
 */
public class WeatherSmallestSpread implements SmallestSpread {

    private final List<WeatherDay> weatherDays = reader.readWeatherFile("/de/exxcellent/challenge/weather.csv");

    /**
     * Calculate smallest spread.
     */
    @Override
    public String calculateSmallestSpread() {
        List<Integer> tempDifferences = weatherDays.stream()
                .map(WeatherDay::compareValues)
                .mapToInt(Integer::intValue)
                .boxed()    // int -> Integer conversion
                .collect(Collectors.toList());

        return IntStream.range(0, tempDifferences.size())
                .boxed()
                .min(Comparator.comparing(tempDifferences::get))
                .map(integer -> String.valueOf(weatherDays.get(integer).getDayId())).orElse("Temperature not found");
    }
}
