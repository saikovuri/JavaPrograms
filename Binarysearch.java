package com.sai;

import java.util.Arrays;

public class Binarysearch {

	public static void main(String[] args) {
		int array[] = { 2, 6, 43, 3, 7, 38, 53, 74, 23, 55 };
		Arrays.sort(array);
		BinarySearchClass bsc = new BinarySearchClass();
		System.out.println("Key position is: " + bsc.binsearch(array, 74));

	}

}

class BinarySearchClass {

	public int binsearch(int[] arr, int key) {
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == arr[mid]) {
				return mid;
			}
			if (key < arr[mid]) {
				end = mid - 1;
			} else {

				start = mid + 1;
			}
		}
		return -1;
	}
}
