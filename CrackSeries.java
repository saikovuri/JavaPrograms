package com.sai;

import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

class CrackSeries {
	public static void main(String[] args) {
		BigInteger[] a = new BigInteger[100];
		BigInteger l;
		BigInteger h;

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of test cases");
		int n = scan.nextInt();
		System.out.println("Enter " + n + " numbers below 12");
		for (int i = 0; i < n; i++) {
			int m = scan.nextInt();

			l = new BigInteger("2");
			h = new BigInteger("2");

			if (m == 1) {
				a[1] = l;
				System.out.println(a[1]);
			} else if (m == 2) {
				a[2] = h;
				System.out.println(a[2]);
			}

			else if (m % 2 == 0) {
				for (int k = 2; k <= m; k = k + 2) {
					a[k] = h;
					h = h.pow(3);
				}
				System.out.println(a[m]);
			} else {
				for (int k = 1; k <= m; k = k + 2) {
					a[k] = l;
					l = l.pow(2);
				}
				System.out.println(a[m]);
			}
		}

	}
}