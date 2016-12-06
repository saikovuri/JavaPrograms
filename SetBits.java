package com.sai;

import java.util.*;
import java.lang.*;
import java.io.*;

class SetBits {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		int index =0;
		int count =0;
		for(int i =0; i<n;i++)
		{
			long[] l = new long[1000000];
			int m = scan.nextInt();
		    while(m>=1)
		    {
		   
		       l[index]= m%2;
		       index++;
		        m =m/2;
		    }
		    
		   for(int z=0 ; z< index;z++ )
		   {
		       if(l[z]==1)
		       count++;
		   }
		      System.out.print(count);
		       System.out.println();
		       count =0;
		}
	}
}