package com.lc.practice.binarysearch;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.collections4.CollectionUtils;
import org.junit.Test;

import com.lc.practice.array.ThreeSum;
import com.lc.practice.binarysearch.BinarySearch;

public class BinarySearchTest
{

    // Iterative implementation of Binary Search
    @Test
    public void shouldReturnMinusOneIfArrayIsEmpty()
    {
	assertEquals(-1, BinarySearch.binarySearch(new int[] {}, 1));
    }

    @Test
    public void shouldReturnMinusOneIfNotFoundInSortedOddArray()
    {
	assertEquals(-1, BinarySearch.binarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9));
    }

    @Test
    public void shouldReturnMinusOneIfNotFoundInSortedEvenArray()
    {
	assertEquals(-1, BinarySearch.binarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 9));
    }

    @Test
    public void shouldReturnZeroIfFoundAsFirstInSortedArray()
    {
	assertEquals(0, BinarySearch.binarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 0));
    }

    @Test
    public void shouldReturnEightIfFoundAtEndInSortedArray()
    {
	assertEquals(8, BinarySearch.binarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 16));
    }

    @Test
    public void shouldReturnFourIfFoundInMiddleInSortedArray()
    {
	assertEquals(4, BinarySearch.binarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 8));
    }

    @Test
    public void shouldReturnSixIfFoundAnywhereInSortedArray()
    {
	int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
	assertEquals(6, BinarySearch.binarySearch(sorted, 12));
    }

    // Recursive implementation of Binary Search
    @Test
    public void shouldReturnMinusOneIfArrayIsEmptyRecursive()
    {
	assertEquals(-1, BinarySearch.recursivBinarySearch(new int[] {}, 1, -1, -1));
    }

    @Test
    public void shouldReturnMinusOneIfNotFoundInSortedOddArrayRecursive()
    {
	assertEquals(-1, BinarySearch.recursivBinarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9, 0, 8));
    }

    @Test
    public void shouldReturnMinusOneIfNotFoundInSortedEvenArrayRecursive()
    {
	assertEquals(-1, BinarySearch.recursivBinarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 9, 0, 8));
    }

    @Test
    public void shouldReturnZeroIfFoundAsFirstInSortedArrayRecursive()
    {
	assertEquals(0, BinarySearch.recursivBinarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 0, 0, 8));
    }

    @Test
    public void shouldReturnEightIfFoundAtEndInSortedArrayRecursive()
    {
	assertEquals(8, BinarySearch.recursivBinarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 16, 0, 8));
    }

    @Test
    public void shouldReturnFourIfFoundInMiddleInSortedArrayRecursive()
    {
	assertEquals(4, BinarySearch.recursivBinarySearch(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 8, 0, 8));
    }

    @Test
    public void shouldReturnSixIfFoundAnywhereInSortedArrayRecursive()
    {
	int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };
	assertEquals(6, BinarySearch.recursivBinarySearch(sorted, 12, 0, 8));

	assertThat(3, is(equalTo(3)));

    }

    // Test case number: 1
    // Test case values: {4,5,6,7,0,1,2} and target = 0
    // Expected output (Post-state): 4

    @Test
    public void testcase1()
    {
	// GIVEN
	int[] testArray = { 4, 5, 6, 7, 0, 1, 2 };
	int target = 0;

	int expected = 4;
	// WHEN
	int result = BinarySearch.searchInRotatedSortedArray(testArray, target);

	// THEN
	assertEquals(expected, result);
    }

    // Test case number: 2
    // Test case values: {4,5,6,7,0,1,2} and target = 3
    // Expected output (Post-state): -1

    @Test
    public void testcase2()
    {
	// GIVEN
	int[] testArray = { 4, 5, 6, 7, 0, 1, 2 };
	int target = 3;

	int expected = -1;
	// WHEN
	int result = BinarySearch.searchInRotatedSortedArray(testArray, target);

	// THEN
	assertEquals(expected, result);
    }

}
