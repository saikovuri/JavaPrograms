package com.sai;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class DuplicateElementsArray {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		int n = scan.nextInt();
		
		int arr[] = new int[n];
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
			set.add(arr[i]);
		}

		java.util.Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
