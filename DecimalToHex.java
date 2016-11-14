package com.sai;

import java.util.Scanner;

class Hexadecimal {
	char hex[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	String str = " ";

	void conversion(int i) {
		while (i > 0) {
			int rem = i % 16;
			str = hex[rem] + str;
			i = i / 16;
		}
	}

	void display() {
		System.out.print(str);

	}

}

public class DecimalToHex {

	public static void main(String[] args) {
		System.out.println("Enter a decimal number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		Hexadecimal d = new Hexadecimal();
		d.conversion(number);
		d.display();

	}

}
