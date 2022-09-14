package de.exxcellent.challenge.dto;

import com.opencsv.bean.CsvBindByName;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * DTO for a Weather Day
 */
public class WeatherDay {

    @CsvBindByName(column = "Day")
    private int dayId;

    @CsvBindByName(column = "MxT")
    private int maxTemp;

    @CsvBindByName(column = "MnT")
    private int minTemp;

    public WeatherDay() {}

    public WeatherDay(int dayId, int maxTemp, int minTemp) {
        this.dayId = dayId;
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int compareValues() {
        return Math.abs(maxTemp - minTemp);
    }

    public int getDayId() {
        return dayId;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
