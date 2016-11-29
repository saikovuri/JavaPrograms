package com.sai;

import java.util.Scanner;

public class JavaPascalTriangle {
	public static void main(String args[]) {

		System.out.println("Enter the number of rows:");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for (int i = 0; i < num; i++) {
			for (int k = num; k > i; k--) {
				System.out.print(" ");
			}
			int number = 1;
			for (int j = 0; j <= i; j++) {
				System.out.print(number + " ");
				number = number * (i - j) / (j + 1);
			}
			System.out.println();

		}

	}
}
