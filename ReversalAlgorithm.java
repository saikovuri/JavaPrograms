package com.sai;

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Queue;
import java.util.LinkedList;

public class ReversalAlgorithm {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int x;
		Queue<Integer> q = new LinkedList<Integer>();
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			x = scan.nextInt();
			for (int j = 0; j < x; j++) {
				q.offer(scan.nextInt());
			}
			int m = scan.nextInt();
			for (int l = 0; l < m; l++) {
				q.offer(q.poll());
			}

			for (int k = 0; k < x; k++) {

				System.out.print(q.poll() + " ");

			}

		}

	}
}