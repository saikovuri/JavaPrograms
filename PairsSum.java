package com.sai;

import java.util.HashMap;

public class PairsSum {

	private int printPairs(int[] arr, long num) {
		int ans = 0;
		HashMap<Integer, Integer> first = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> next = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			first.put(arr[i], 1);
		}

		for (int j = 0; j < arr.length; j++) {
			if (next.get(arr[j]) == null) {
				int now = (int) (num - arr[j]);
				if (first.get(now) != null) {
					ans++;
					next.put(arr[j], 1);
					next.put(now, 1);
				}

			}
		}

		return ans;
	}

	public static void main(String[] args) {
		PairsSum ps = new PairsSum();
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		int count = ps.printPairs(arr, 7);
		System.out.println(count + " unique pairs whose sum is 7 ");
	}

}
