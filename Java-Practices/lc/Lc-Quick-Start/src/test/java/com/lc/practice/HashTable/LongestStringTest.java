package com.lc.practice.HashTable;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestStringTest
{
    // Test case number: 1
    // Test case values: "abcabcbb"
    // Expected output (Post-state): 3
    @Test
    public void testLengthOfLongestSubstringCaseOne()
    {
	LongestString arrayUtils = new LongestString();
	String testString = "abcabcbb";
	int expected = 3;
	assertTrue("--------", expected == arrayUtils.lengthOfLongestSubstring(testString));
    }

    // Test case number: 2
    // Test case values: "bbbbb"
    // Expected output (Post-state): 1

    @Test
    public void testLengthOfLongestSubstringCaseTwo()
    {
	LongestString arrayUtils = new LongestString();
	String testString = "bbbbb";
	int expected = 1;
	assertTrue(expected == arrayUtils.lengthOfLongestSubstring(testString));
    }

    // Test case number: 3
    // Test case values: "pwwkew"
    // Expected output (Post-state): 3

    @Test
    public void testLengthOfLongestSubstringCaseThree()
    {
	LongestString arrayUtils = new LongestString();
	String testString = "pwwkew";
	int expected = 3;
	assertTrue(expected == arrayUtils.lengthOfLongestSubstring(testString));
    }

    // Test case number: 1
    // Test case values: "au"
    // Expected output (Post-state): 2

    @Test
    public void testLengthOfLongestSubstringCaseFour()
    {
	LongestString arrayUtils = new LongestString();
	String testString = "au";
	int expected = 2;
	assertTrue(expected == arrayUtils.lengthOfLongestSubstring(testString));
    }

}
