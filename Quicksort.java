package com.sai;

public class Quicksort {
	public static void main(String[] args) {
		int[] inputArr = { 45, 23, 11, 89, 77, 98, 4, 28, 65, 43 };
		Quicksort qs = new Quicksort();
		int[] temp = qs.Qsort(inputArr, 0, 9);
		for (int i : temp) {
			System.out.println(i);
		}

	}

	public int[] Qsort(int[] temp, int start, int end) {
		if (start < end) {
			int pIndex = partition(temp, start, end);
			Qsort(temp, start, pIndex - 1);
			Qsort(temp, pIndex + 1, end);
		}
		return temp;
	}

	public int partition(int[] temp, int start, int end) {
		int pivot = temp[end];
		int pIndex = start;

		for (int i = start; i < end; i++) {

			if (temp[i] <= pivot) {
				int tempPindex = temp[pIndex];
				temp[pIndex] = temp[i];
				temp[i] = tempPindex;
				pIndex++;
			}
		}

		int tempPindex = temp[pIndex];
		temp[pIndex] = temp[end];
		temp[end] = tempPindex;

		return pIndex;
	}

}
