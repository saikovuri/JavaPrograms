package com.sai;

import java.util.Arrays;

public class DupArrayElements {

	public static void main(String[] args) {

		int arr[] = new int[] { 1,1, 2, 2, 2, 3, 4, 3, 5, 4, 6, 6 };
		int temp;
		//Performing sort
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i; j < arr.length - 1; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}

		int current = arr[0];
		boolean bool = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == current && !bool) {
				bool = true;
			} else if (current != arr[i]) {
				System.out.println(" " + current);
				current = arr[i];
				bool = false;

			}
		}

		System.out.println(" " + current);

	}

}
