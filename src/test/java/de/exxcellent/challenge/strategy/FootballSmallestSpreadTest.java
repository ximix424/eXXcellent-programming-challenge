package de.exxcellent.challenge.strategy;

import com.jparams.verifier.tostring.ToStringVerifier;
import de.exxcellent.challenge.dto.FootballTeam;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests the FootballSmallestSpread class
 */
public class FootballSmallestSpreadTest {

    /**
     * Calculates the Football Team smallest spread
     */
    @Test
    void test_calculateSmallestSpread() {
        //
        // GIVEN
        //
        SmallestSpread footballSmallestSpread = new FootballSmallestSpread();

        //
        // WHEN
        //
        String result = footballSmallestSpread.calculateSmallestSpread();

        //
        // THEN
        //
        assertEquals(result, "Aston_Villa");
    }

    /**
     * Verifies the toString method
     */
    @Test
    public void test_FootballTeam_toString() {
        ToStringVerifier.forClass(FootballTeam.class).verify();
    }
}
