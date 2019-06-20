package com.lc.practice.HashTable;

import java.util.HashMap;
import java.util.Map;

public class LongestString
{
    public int lengthOfLongestSubstring(String s)
    {
	if (null == s || s.length() == 0)
	{
	    return 0;
	}
	int first = 0;
	int second = 0;
	char[] chars = s.toCharArray();

	int lMax = 1;
	Map<Character, Integer> saved = new HashMap<>();

	while (first < chars.length)
	{
	    if (!saved.containsKey(chars[first]))
	    {
		saved.put(Character.valueOf(chars[first]), Integer.valueOf(first));
	    }
	    else
	    {
		lMax = (lMax < (first - second)) ? (first - second) : lMax;
		int duplicatePosition = saved.get(Character.valueOf(chars[first]));
		while (second <= duplicatePosition)
		{
		    saved.remove(Character.valueOf(chars[second]));
		    second++;
		}
		saved.put(Character.valueOf(chars[first]), Integer.valueOf(first));
	    }
	    first++;
	}
	lMax = (lMax < saved.size()) ? saved.size() : lMax;
	return lMax;

    }
}
