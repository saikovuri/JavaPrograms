package com.sai;

public class Selectionsort {

	private int[] SortMechanism(int arr[], int length) {

		for (int i = 0; i < length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < length; j++) {
				if (arr[j] < arr[min]) 
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;

		}
		return arr;

	}

	public static void main(String[] args) {
		int arr[] = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		int length = arr.length;
		Selectionsort ss = new Selectionsort();
		ss.SortMechanism(arr, length);
		for(int i : arr)
		{
			System.out.print(i);
			System.out.print(" ");
		
		
		}

	}

}
