package com.sai;

public class MergeSortedArray {

	private void merge(int[] a, int l1, int[] b, int l2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int d[] = new int[l1 + l2];

		while (i < l1 && j < l2) {
			if (a[i] < b[j]) {
				d[k] = a[i];
				i++;
			} else {
				d[k] = b[j];
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

		// private void merge(int[] nums1,int m, int[] nums2, int n) {
		// int num1Tail = m-1;
		// int num2Tail = n-1;
		// int numTail = n+m-1;
		// while(num2Tail>=0)
		// {
		// if(num1Tail>=0 && nums1[num1Tail] > nums2[num2Tail])
		// {
		// nums1[numTail] = nums1[num1Tail];
		// num1Tail--;
		// }
		// else{
		// nums1[numTail] = nums2[num2Tail];
		// num2Tail--;
		// }
		// numTail--;
		// }
		//
		// for (int i : nums1) {
		// System.out.println(i);
		// }

	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 5 };
		int b[] = { 4, 6 };
		MergeSortedArray msa = new MergeSortedArray();
		msa.merge(a, a.length, b, b.length);

	}

}
