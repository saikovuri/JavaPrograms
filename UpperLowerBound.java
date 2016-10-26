package com.sai;

import java.util.Scanner;

public class UpperLowerBound {

	private int lowerbound(int[] arr, int n, int l, int u) {

		if (l <= u) {
			int mid = (l + u) / 2;
			if (arr[mid] == n) {
				return lowerbound(arr, n, l, mid - 1);
			} else if (arr[mid] > n) {
				return lowerbound(arr, n, l, mid - 1);
			} else {
				return lowerbound(arr, n, mid + 1, u);
			}
		} else {
			return l;
		}
	}

	private int upperbound(int[] arr, int n, int l, int u) {

		if (l <= u) {
			int mid = (l + u) / 2;
			if (arr[mid] == n) {
				return upperbound(arr, n, mid + 1, u);
			} else if (arr[mid] > n) {
				return upperbound(arr, n, l, mid - 1);
			} else {
				return upperbound(arr, n, mid + 1, u);
			}
		} else {
			return u;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 2, 3, 4, 4, 5, 5, 5, 5, 6 };
		int length = arr.length;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to find its occurence");
		int n = scan.nextInt();
		UpperLowerBound ul = new UpperLowerBound();
		int lower = ul.lowerbound(arr, n, 0, length - 1);
		int upper = ul.upperbound(arr, n, 0, length - 1);
		System.out.println("The number is occured " + (upper - lower + 1) + " times");

	}

}
