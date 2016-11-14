package com.topcoder.easy;

import java.util.Arrays;

public class prettyPrint {

	public static int printPairsUsingTwoPointers(int[] numbers, int k) {
		int count = 0;
		if (numbers.length < 2) {
			return 1;
		}
		Arrays.sort(numbers);
		int left = 0;
		int right = numbers.length - 1;
		while (left <= right) {
			int sum = numbers[left] + numbers[right];
			if (sum == k) {
				count++;
				left = left + 1;
				right = right - 1;
			} else if (sum < k) {
				left = left + 1;
			} else if (sum > k) {
				right = right - 1;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 4, 3, 5, 7, 8, 9 };
		System.out.println(printPairsUsingTwoPointers(arr, 7)+ " unique pairs whose sum is 7");

	}

}
