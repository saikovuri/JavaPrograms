package com.topcoder.easy;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class OneNumberMissing {

	private int FindMissingNumber(int[] arr) {

		if(arr.length==0||arr== null)
		{
			return 0;
		}
		Set<Integer> set = new HashSet<Integer>();
		for(int i =1; i<arr.length+1;i++)
		{
			set.add(i);
		}
		Iterator<Integer> itr1 = set.iterator();
		
		for(int i=0;i<arr.length;i++)
		{
			set.remove(arr[i]);
		}
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext())
		{
			return (int)itr.next();	
		}
		return 0;
    }

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5,6,7,8,9,11 };
		OneNumberMissing onm = new OneNumberMissing();
		int n = onm.FindMissingNumber(arr);
		
		System.out.println(n + " is missing");

	}

}
