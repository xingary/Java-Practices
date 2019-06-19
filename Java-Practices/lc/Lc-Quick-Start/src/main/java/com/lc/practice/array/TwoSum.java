package com.lc.practice.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    // Given an sorted array of integers, return indices of the two numbers such
    // that they add up to a specific target.

    // Each input would have exactly one solution, and may not use the same element
    // twice.
    public int[] twoSum(int[] nums, int target)
    {
	int[] indices = new int[2];
	Map<Integer, Integer> saved = new HashMap<>();
	int k;

	for (int i = 0; i < nums.length; i++)
	{

	    if (saved.containsKey(Integer.valueOf(nums[i])))
	    {
		indices[0] = saved.get(Integer.valueOf(nums[i]));
		indices[1] = i;
		break;
	    }
	    k = target - nums[i];
	    saved.put(Integer.valueOf(k), Integer.valueOf(i));
	}
	return indices;

    }
}
