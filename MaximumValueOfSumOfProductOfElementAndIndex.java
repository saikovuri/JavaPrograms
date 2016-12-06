package com.sai;

class MaximumValueOfSumOfProductOfElementAndIndex {

	static void printMaximumValueOfSumOfProductOfElementAndIndex(int[] arr) {
		int n = arr.length;
		int currSum = 0;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			currSum += i * arr[i];
			sum += arr[i];
		}

		int maxSum = currSum;
		int rotations = 0;

		for (int i = 1; i < n; i++) {
			currSum += (sum - (n * arr[n - i]));

			if (currSum > maxSum) {
				maxSum = currSum;
				rotations = i;
			}
		}

		System.out.println("Max value: " + maxSum);
		System.out.println("Number of rotations: " + rotations);
	}

	static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 10, 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		printArray(arr);

		printMaximumValueOfSumOfProductOfElementAndIndex(arr);
	}
}