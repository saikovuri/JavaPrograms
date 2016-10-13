package com.sai;

public class StarsProgram{

	public static void main(String[] args) {

		System.out.println("Left Aligned Triangle with * \n");
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}
		System.out.println("\n");
		System.out.println("Reverse Aligned Triangle with * \n");

		for (int i = 1; i <= 5; i++) {
			for (int j = i; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");

		}

		System.out.println("\n");
		System.out.println("Right Aligned Triangle with * \n");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i + j) > 5) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}

		System.out.println("\n");
		System.out.println("Center Aligned Triangle with * \n");

		int n = 6;
		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n - i; j++) {

				System.out.print(" ");
			}

			for (int k = 0; k <= 2 * i; k++) {
				System.out.print("*");
			}

			System.out.println("\n");

		}

	}

}
