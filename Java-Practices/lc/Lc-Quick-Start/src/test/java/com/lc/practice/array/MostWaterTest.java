package com.lc.practice.array;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MostWaterTest
{
    // Test case number: 1
    // Test case values: { 1,8,6,2,5,4,8,3,7 }
    // Expected output (Post-state): 49

    @Test
    public void testcase1()
    {
	// GIVEN
	MostWater mw = new MostWater();
	int[] testArray = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
	int expected = 49;

	// WHEN
	int result = mw.maxArea(testArray);
	// THEN
	assertEquals(expected, result);
    }

    // Test case number: 2
    // Test case values: { 3 1 2 4 5 }
    // Expected output (Post-state): 12

    @Test
    public void testcase2()
    {
	// GIVEN
	MostWater mw = new MostWater();
	int[] testArray = { 3, 1, 2, 4, 5 };
	int expected = 12;

	// WHEN
	int result = mw.maxArea(testArray);
	// THEN
	assertEquals(expected, result);
    }

}
