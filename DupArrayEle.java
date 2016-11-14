package com.topcoder.easy;

import java.util.Arrays;

public class DupArrayEle {

	private static int[] removedups(int[] a) {
		int len = a.length;
		int i = 0, j = 1;
		while (j < len) {
			if (a[i] == a[j]) {
				j++;
			} else {
				i++;
				a[i] = a[j];
				j++;
			}
		}

		int[] b = Arrays.copyOf(a, i + 1);
		return b;

	}

	public static void main(String[] args) {
		int arr[] = new int[] { 1, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6 };

		int x1[] = removedups(arr);

		for (int x : x1) {
			System.out.println(x);
		}
	}

}
