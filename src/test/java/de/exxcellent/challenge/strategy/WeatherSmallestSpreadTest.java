package de.exxcellent.challenge.strategy;

import com.jparams.verifier.tostring.ToStringVerifier;
import de.exxcellent.challenge.dto.WeatherDay;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the WeatherSmallestSpread class
 */
public class WeatherSmallestSpreadTest {

    /**
     * Calculates the Weather smallest spread
     */
    @Test
    void test_calculateSmallestSpread() {
        //
        // GIVEN
        //
        SmallestSpread weatherSmallestSpread = new WeatherSmallestSpread();

        //
        // WHEN
        //
        String result = weatherSmallestSpread.calculateSmallestSpread();

        //
        // THEN
        //
        assertEquals(result, "14");
    }

    /**
     * Verifies the toString method
     */
    @Test
    public void test_WeatherDay_toString()
    {
        ToStringVerifier.forClass(WeatherDay.class).verify();
    }
}
