package com.sai;

import java.util.Scanner;

public class TowersOfHanoi {

	public void solve(int n, String start, String auxillary, String end) {
		if (n == 1) {
			System.out.println(start + " -> " + end);
		} else {
			solve(n - 1, start, end, auxillary);
			System.out.println(start + " -> " + end);
			solve(n - 1, auxillary, start, end);
		}

	}

	public static void main(String[] args) {
		TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
		System.out.println("Enter the number of discs: ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		towersOfHanoi.solve(n, "A", "B", "C");

	}

}
