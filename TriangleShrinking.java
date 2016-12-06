package com.sai;

import java.util.*;

class TriangleShrinking {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of string: ");

		int n = scan.nextInt();
		String[] str = new String[n];
		int i = 0;
		scan.nextLine();
		while (n != i) {
			str[i] = scan.nextLine();
			i++;

		}
		scan.close();

		for (int j = 0; j < str.length; j++) {
			System.out.println(str[j]);
			char[] c = str[j].toCharArray();

			for (int m = 0; m < str[j].length() - 1; m++) {
				c[m] = '.';
				System.out.println(String.valueOf(c));

			}

		}

		/*
		 * for (int j = 0; j < str.length; j++) 
		 * {
		 * StringBuilder s = new StringBuilder(str[j]); 
		 * for (int m = 0; m < str[j].length(); m++) {
		 * System.out.print(s); 
		 * System.out.println();
		 *  s.setCharAt(m, '.'); }
		 * 
		 * }
		 */

	}

}