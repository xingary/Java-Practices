package com.lc.practice.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest
{

    @Test
    public void testTwoSum()
    {
	// GIVEN
	TwoSum ts = new TwoSum();
	int[] testArray = { 2, 7, 11, 15 };
	int testValue = 9;
	int[] expected = { 0, 1 };

	// WHEN
	int[] result = ts.twoSum(testArray, testValue);
	// THEN
	assertArrayEquals(expected, result);
    }
}
