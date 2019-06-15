package com.lc.practice.array;

import java.util.HashMap;

public class TwoSum
{
    public int[] twoSum(int[] nums, int target)
    {
	int[] indices = new int[2];
	HashMap<Integer, Integer> saved = new HashMap<>();
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
