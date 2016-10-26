package com.sai;

public class InsertionSort {

	public static void main(String[] args) {
		
		int arr[] = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		int length = arr.length;
		InsertionSort is = new InsertionSort();
		int arr2[] = is.InsertionSortMechanism(arr, length);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(" ");

		}

	}

	private int[] InsertionSortMechanism(int[] arr, int length) {
		
		for(int i =1; i< length; i++)
		{	
			int key = arr[i];
			int val = i -1;
			while(val >= 0 && key < arr[val])
			{
				int temp = arr[val];
				arr[val] = arr[val+1];
				arr[val+1] = temp;
				val--;
			}
			
		}
		
		return arr;
	}

}
