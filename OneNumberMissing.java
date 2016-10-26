package com.sai;

public class OneNumberMissing {

	private int FindMissingNumber(int[] arr, int n) {

		int sum1 = (n + 1) * (n + 2) / 2;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum2 += arr[i];
		}

		return (sum1 - sum2);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		int length = arr.length;
		OneNumberMissing onm = new OneNumberMissing();
		int n = onm.FindMissingNumber(arr, length);
		System.out.println(n + " was missing");

	}

}
