package com.bubblesort.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

/**
 * Unit test for Bubble Sort.
 */
public class BubbleSortTest {
    /**
     * Rigorous Test :-)
     */
    BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void shouldReturnAscOrderedTable() {
        int[] input = { -2, 0, -9, 11, 45 };
        int[] outputExpected = { -9, -2, 0, 11, 45 };
        int[] output = bubbleSort.sortAsc(input);

        assertNotNull(output);
        assertTrue(Arrays.equals(outputExpected, output));
    }
}
