package com.sai;

public class RepeatedNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 5 };
		boolean bool[] = new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int val = a[i];
			if (bool[val]) {

				System.out.println(val);
				bool[val] = false;
			}
			bool[val] = true;

		}
	}
}
