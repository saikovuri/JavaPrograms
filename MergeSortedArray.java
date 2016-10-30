package com.sai;

public class MergeSortedArray {

	private void merge(int[] a, int[] b) {
		int l1 = a.length;
		int l2 = b.length;

		int i = 0;
		int j = 0;
		int k = 0;
		int d[] = new int[l1 + l2];

		while (i < l1 && j < l2) {
			if (a[i] < b[j]) {
				d[k] = a[i];
				i++;
			} else {
				d[k] = b[j + 1];
				j++;
			}
			k++;

		}
		while (i < a.length) {
			d[k] = a[i];
			i++;
			k++;
		}
		while (j < b.length) {
			d[k] = b[j];
			k++;
			j++;
		}

		for (int m : d) {
			System.out.println(m);
		}
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4 };
		int b[] = { 5, 6 };
		MergeSortedArray msa = new MergeSortedArray();
		msa.merge(a, b);

	}

}
