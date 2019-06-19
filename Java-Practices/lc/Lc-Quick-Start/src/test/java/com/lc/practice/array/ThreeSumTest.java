package com.lc.practice.array;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import org.apache.commons.collections4.CollectionUtils;

public class ThreeSumTest
{
    // Test case number: 1
    // Test case values: {-1 0 1 2 -1 -4}
    // Expected output (Post-state): { -1, 0, 1} and { -1, -1, 2}

    @Test
    public void testcase1()
    {
	// GIVEN
	ThreeSum ths = new ThreeSum();
	int[] testArray = { -1, 0, 1, 2, -1, -4 };

	Integer[] int1 = { -1, 0, 1 };
	List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(int1));
	Integer[] int2 = { -1, -1, 2 };
	List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(int2));

	List<List<Integer>> expectedList = new ArrayList<>();
	expectedList.add(list1);
	expectedList.add(list2);

	// WHEN
	List<List<Integer>> result = ths.threeSum(testArray);
	// THEN

	assertTrue(CollectionUtils.isEqualCollection(result, expectedList));
    }
}
