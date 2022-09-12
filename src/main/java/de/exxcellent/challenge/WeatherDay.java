package de.exxcellent.challenge;

import com.opencsv.bean.CsvBindByName;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class WeatherDay {

    @CsvBindByName(column = "Day")
    private int dayId;

    @CsvBindByName(column = "MxT")
    private int maxTemp;

    @CsvBindByName(column = "MnT")
    private int minTemp;


    public int compareValues() {
        return Math.abs(maxTemp - minTemp);
    }

    public int getDayId() {
        return dayId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }
}
