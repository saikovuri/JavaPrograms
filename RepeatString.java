package com.topcoder.easy;

public class RepeatString {
	
	public static void main(String[] args) {
		int count=0;
		String str ="ababaa";
		int len = str.length();
		boolean is_even = false;
		if(len %2 ==0)
		{
			is_even=true;
		}
		char[] str1= str.toCharArray();
		int len1= (str1.length/2);
		for(int i =0;i<len1;i++ )
		{
			if(str1[i]== str1[i+len1])
			{
				System.out.println(str1[i]+","+ str1 [i+len1]);
			} else {
				count += 1;
			}

		}
		
		System.out.println(count);
		
	}

}
