package com.lc.practice.array;

public class MostWater
{
    // Given n non-negative integers a1, a2, ..., an , where each represents a point
    // at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
    // of line i is at (i, ai) and (i, 0). Find two lines, which together with
    // x-axis forms a container, such that the container contains the most water.
    public int maxArea(int[] height)
    {
	if (height == null || height.length < 2)
	{
	    return 0;
	}
	int area = 0;
	int left = 0;
	int right = height.length - 1;

	while (left < right)
	{
	    area = Math.max(area, (right - left) * Math.min(height[left], height[right]));
	    if (height[left] > height[right])
	    {
		right--;
	    }
	    else if (height[left] < height[right])
	    {
		left++;
	    }
	    else
	    {
		left++;
		right--;
	    }
	}
	return area;

    }
}