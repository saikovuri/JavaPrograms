package com.sai;

import java.util.*;

public class Fibonacci {
	
	 public static void main(String args[])
		{
			System.out.println("Enter the last number :");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			Demo demo = new Demo();
			System.out.println("Fibonacci series is:");
			int res =0;
			for(int i=1; i<=n; i++)
			{
				res = demo.fibo(i);
				System.out.println(res);
				
			}
		}
	 
}
class Demo {
	
	int fibo(int n)
		{
		
		if(n==1||n== 2)
		{
			return 1;
		}
		else 
		{
			return (fibo(n-1)+fibo(n-2));
		
		}
	}


}
