package com.sai;

import java.util.Scanner;

class AtoI {
	long num = 0;
	int l = 0;
	boolean bool = true;

	int atoi(String str1) {
		if (str1 == null)
			return 0;
		String str = str1.trim();
		int len = str.length();
		if (len == 0) {
			return 0;
		}
		char[] c = str.toCharArray();

		if (c[l] == '-') {
			bool = false;
			l++;

		} else if (c[l] == '+') {
			l++;

		}

		for (; l < str.length(); l++) {
			if (c[l] < '0' || c[l] > '9') {
				return -1;
			}
			int m = c[l] - '0';
			num = num * 10 + m;

		}

		if (bool) {

			return (int) num;
		} else {
			return (int) (-1 * num);
		}
	}

	public static void main(String[] args) {
		AtoI a = new AtoI();
		System.out.println("Enter a string:");
		Scanner scan = new Scanner(System.in);
		int x = a.atoi(scan.nextLine());
		System.out.println("Result is " + x);
		scan.close();
	}
}
