package com.sai;

public class MinHeap {
	int position;
	int[] mH;

	MinHeap(int length) {
		position = 0;
		mH = new int[length + 1];

	}

	private void createHeap(int[] arr) {
		if (arr.length > 0) {
			for (int i = 0; i < arr.length; i++) {
				insert(arr[i]);
			}
		}

	}

	private void insert(int x) {
		if (position == 0) {
			position++;
			mH[position] = x;
			position++;
		} else {
			mH[position] = x;
			position++;
			bubbleUp();
		}

	}

	private void bubbleUp() {
		int pos = position - 1;
		while (pos > 0 && mH[pos / 2] > mH[pos]) {
			int y = mH[pos];
			mH[pos] = mH[pos / 2];
			mH[pos / 2] = y;
			pos = pos / 2;
		}
	}

	private int extractMin() {
		int min = mH[1];
		mH[1] = mH[position - 1];
		mH[position - 1] = 0;
		position--;
		sinkDown(1);
		return min;

	}

	private void sinkDown(int i) {
		int smallest = i;

		if (2 * i < position && mH[2 * i] < mH[smallest]) {
			smallest = 2 * i;
		}
		if (2 * i + 1 < position && mH[2 * i + 1] < mH[smallest]) {
			smallest = 2 * i + 1;
		}
		if (smallest != i) {
			swap(smallest, i);
			sinkDown(smallest);
		}

	}

	private void swap(int a, int b) {
		int temp = mH[a];
		mH[a] = mH[b];
		mH[b] = temp;

	}

	private void display() {

		for (int i = 1; i < mH.length; i++) {
			System.out.print(mH[i] + " ");
		}
		System.out.println("");

	}

	public static void main(String[] args) {

		int arr[] = { 3, 2, 1, 7, 8, 4, 10, 16, 12 };
		MinHeap mh = new MinHeap(arr.length);
		System.out.println("Heap elements before:");
		for (int i : arr) {
			System.out.print(i + " ");

		}
		System.out.println();
		mh.createHeap(arr);
		System.out.println("Min Heap");
		mh.display();
		System.out.println("Extracting minimum numbers in order");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(mh.extractMin() + " ");
		}
	}

}
