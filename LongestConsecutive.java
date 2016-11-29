package com.sai;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive {
	
	private int longestconsecutive(int[] arr) {
		if(arr.length ==0)
		{
			return 0;
		}
		
		Set<Integer> set = new HashSet<Integer>();
		int max =1;
		
		for(int i : arr)
		{
			set.add(i);
		}
		
		for(int i : arr)
		{
			int left = i-1;
			int right = i+1;
			int count =1;
			
			while(set.contains(left))
			{
				count++;
				set.remove(left);
				left--;
			}
			while(set.contains(right))
			{
				count++;
				set.remove(right);
				right++;
			}
			
			max = Math.max(count,max);
		}
		
		
		
		return max;
	}

	public static void main(String[] args) {
		int arr[] = {1,2,4,5,7,8,6};
		LongestConsecutive lc = new LongestConsecutive();
		int len = lc.longestconsecutive(arr);
		System.out.println(len);
		
		

	}

}
