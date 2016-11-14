package com.sai;

public class FindingDupNumber {

	private int findDup(int[] arr) {
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			int count = 0;
			for (int a : arr) {
				if (a <= mid) {
					count++;
				}
			}
			if (count <= mid) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

		}

		return low;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10, 11 };
		FindingDupNumber fdn = new FindingDupNumber();
		System.out.println("Duplicate number is" + fdn.findDup(arr));

	}

}
