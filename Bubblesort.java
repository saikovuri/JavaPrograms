package com.sai;

public class Bubblesort {

	private int[] BubbleSortMechanism(int[] arr, int length) {

		for (int i = 0; i < length - 1; i++) {
			int flag =0;
			for(int j = i+1; j<length;j++)
			{
				if(arr[i] > arr[j] )
				{
					
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					flag =1;
				}
			}
			if(flag==0)
				break;
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		int length = arr.length;
		Bubblesort bs = new Bubblesort();
		bs.BubbleSortMechanism(arr, length);
		for (int i : arr) {
			System.out.print(i);
			System.out.print(" ");

		}

	}

}
