package com.sai;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

class CheckSquare {

	static int distance(int x, int y, int u, int v) {

		int dist = (int) Math.sqrt((Math.pow((u - x), 2)) + (Math.pow((v - y), 2)));

		return dist;

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of test cases:");
		int num = scan.nextInt();
		System.out.println("Enter coordinates for "+num+ " testcases");
		while (num != 0) {
			num--;
			int a = scan.nextInt();
			int b = scan.nextInt();
			int c = scan.nextInt();
			int d = scan.nextInt();
			int e = scan.nextInt();
			int f = scan.nextInt();
			int g = scan.nextInt();
			int h = scan.nextInt();

			int d1 = distance(a, b, c, d);
			int d2 = distance(a, b, e, f);
			int d3 = distance(a, b, g, h);
			int d4 = distance(c, d, e, f);
			 int d5 = distance(c, d, g, h);
			int d6 = distance(e, f, g, h);

			if(d1 == d2)
		    {
		        if(d3 == d4)
		        {
		            System.out.println("It forms a sqaure");
		        }
		        else
		        {
		            System.out.println("Doesnt form square");
		        }
		    }
		    else if(d1==d3)
		    {
		        if(d2 == d5)
		        {
		            System.out.println(1);
		        }
		        else
		        {
		            System.out.println(0);
		        }
		    }
		    else if(d2==d3)
		    {
		        if(d1 == d6 )
		        {
		            System.out.println(1);
		        }
		        else
		        {
		            System.out.println(0);
		        }
		    }
		    else
		    {
		        System.out.println(0);
		    }

		}
		System.out.println();
		scan.close();

	}
}