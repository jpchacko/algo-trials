package interval.sum.test;


import intervals.sum.IntervalSum;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IntervalSumTest {

    private final IntervalSum solver = new IntervalSum();

    @Test
    void shouldCalculateDistancesForRepeatedValues() {

        int[] input = {2, 3, 4, 3, 2, 1, 5};

        long[] expected = {4, 2, 0, 2, 4, 0, 0};

        long[] actual = solver.getDistances(input);

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnZerosForUniqueValues() {

        int[] input = {1, 2, 3, 4};

        long[] expected = {0, 0, 0, 0};

        assertArrayEquals(expected, solver.getDistances(input));
    }

    @Test
    void shouldHandleAllIdenticalValues() {

        int[] input = {5, 5, 5, 5};

        long[] expected = {6, 4, 4, 6};

        assertArrayEquals(expected, solver.getDistances(input));
    }

    @Test
    void shouldHandleSingleElement() {

        int[] input = {10};

        long[] expected = {0};

        assertArrayEquals(expected, solver.getDistances(input));
    }

    @Test
    void shouldHandleEmptyArray() {

        int[] input = {};

        long[] expected = {};

        assertArrayEquals(expected, solver.getDistances(input));
    }

    @Test
    void shouldHandleNegativeNumbers() {

        int[] input = {-1, 2, -1, 2};

        long[] expected = {2, 2, 2, 2};

        assertArrayEquals(expected, solver.getDistances(input));
    }
}

