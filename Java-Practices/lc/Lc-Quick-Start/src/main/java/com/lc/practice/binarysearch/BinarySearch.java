package com.lc.practice.binarysearch;

public class BinarySearch
{
    public static int binarySearch(int[] arr, int value)
    {

	if (arr.length == 0)
	{
	    return -1;
	}
	int start = 0;
	int end = arr.length - 1;
	int index = -1;

	while (start <= end)
	{
	    int middle = start + (end - start) / 2;
	    if (value == arr[middle])
	    {
		index = middle;
		break;
	    }
	    else if (value > arr[middle])
	    {
		start = middle + 1;
	    }
	    else
	    {
		end = middle - 1;
	    }
	}
	return index;
    }

    public static int recursivBinarySearch(int[] arr, int value, int start, int end)
    {

	if (arr.length == 0)
	{
	    return -1;
	}

	int index = -1;
	if (start > end)
	{
	    return index;
	}

	int middle = start + (end - start) / 2;
	if (value == arr[middle])
	{
	    index = middle;
	    return index;
	}
	else if (value > arr[middle])
	{
	    return recursivBinarySearch(arr, value, middle + 1, end);
	}
	else
	{
	    return recursivBinarySearch(arr, value, start, middle - 1);
	}
    }

    public static int searchInRotatedSortedArray(int[] nums, int target)
    {
	int n = nums.length;
	int low = 0;
	int high = n - 1;
	while (low <= high)
	{
	    int mid = low + (high - low) / 2;
	    if (target == nums[mid])
	    {
		return mid;
	    }
	    if (nums[mid] <= nums[high])
	    {
		if (target > nums[mid] && target <= nums[high])
		{
		    low = mid + 1;
		}
		else
		{
		    high = mid - 1;
		}
	    }
	    else
	    {
		if (nums[low] <= target && target < nums[mid])
		{
		    high = mid - 1;

		}
		else
		{
		    low = mid + 1;
		}
	    }
	}
	return -1;

    }
}
