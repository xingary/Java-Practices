package com.lc.practice.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    // Find all unique triplets in the array which gives the sum
    // of zero.
    public List<List<Integer>> threeSum(int[] nums)
    {
	if (nums == null)
	    return null;
	List<List<Integer>> result = new ArrayList<>();
	if (nums.length < 3)
	    return result;

	Arrays.sort(nums);

	int base = 0;
	int preValue;
	while (base < nums.length - 2)
	{
	    int left = base + 1;
	    int right = nums.length - 1;

	    while (left < right)
	    {
		if (nums[base] + nums[left] + nums[right] == 0)
		{
		    List<Integer> list = new ArrayList<>();
		    list.add(nums[base]);
		    list.add(nums[left]);
		    list.add(nums[right]);
		    result.add(list);
		    preValue = nums[left];
		    left++;
		    while (left < nums.length - 1 && nums[left] == preValue)
		    {
			left++;
		    }

		    preValue = nums[right];
		    right--;
		    while (right > 0 && nums[right] == preValue)
		    {
			right--;
		    }

		}
		else if (nums[base] + nums[left] + nums[right] > 0)
		{
		    preValue = nums[right];
		    right--;
		    while (right > 0 && nums[right] == preValue)
		    {
			right--;
		    }
		}
		else
		{
		    preValue = nums[left];
		    left++;
		    while (left < nums.length - 1 && nums[left] == preValue)
		    {
			left++;
		    }

		}
	    }

	    preValue = nums[base];
	    base++;
	    while (base < nums.length - 1 && nums[base] == preValue)
	    {
		base++;
	    }

	}
	return result;
    }
}
