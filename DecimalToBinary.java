package com.sai;

import java.util.Scanner;

class Decimal {
	int[] arr = new int[40];
	int index = 0;

	void conversion(int i) {
		while (i > 0) {
			arr[index] = i % 2;
			index++;
			i = i / 2;
		}
	}

	void display() {
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}

public class DecimalToBinary {

	public static void main(String[] args) {
		System.out.println("Enter a decimal number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		Decimal d = new Decimal();
		d.conversion(number);
		d.display();

	}

}
