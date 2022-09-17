package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Remove the following placeholder:
        Square target = new BasicSquare();
        Square CheckTarget= new BasicSquare();

        target.isAccessibleTo(unit);
        unit.occupy(target);

        assertThat(unit.getSquare()).isEqualTo(target);
        assertThat(unit.getSquare()).isNotEqualTo(CheckTarget);

    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Remove the following placeholder:
        Square a = new BasicSquare();
        Square b = new BasicSquare();

        unit.occupy(a);
        unit.occupy(b);

        assertThat(unit.getSquare()).isEqualTo(b);
        assertThat(unit.getSquare()).isNotEqualTo(a);
    }
}
