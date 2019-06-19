package com.lc.practice.array;

import static org.junit.Assert.*;

import org.junit.Test;

public class TwoSumTest
{

    // Test case number: 1
    // Test case values: { 2, 7, 11, 15 } and target = 9
    // Expected output (Post-state): { 0, 1 }

    @Test
    public void testcase1()
    {
	// GIVEN
	TwoSum ts = new TwoSum();
	int[] testArray = { 2, 7, 11, 15 };
	int target = 9;
	int[] expected = { 0, 1 };

	// WHEN
	int[] result = ts.twoSum(testArray, target);
	// THEN
	assertArrayEquals(expected, result);
    }

    // Test case number: 2
    // Test case values: { 0, 2, 11, 19, 90 } and target = 21
    // Expected output (Post-state): { 1, 3 }

    @Test
    public void testcase2()
    {
	// GIVEN
	TwoSum ts = new TwoSum();
	int[] testArray = { 0, 2, 11, 19, 90 };
	int target = 21;
	int[] expected = { 1, 3 };

	// WHEN
	int[] result = ts.twoSum(testArray, target);
	// THEN
	assertArrayEquals(expected, result);
    }

}
