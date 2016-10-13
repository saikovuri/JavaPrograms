package com.sai;

import java.util.Scanner;

class Roman {
	int lastnumber = 0;
	int lastdecimal = 0;

	public void conversion(String str) {
		String str1 = str.toUpperCase();
		int len = str1.length();
		for (int i = len - 1; i >= 0; i--) {
			char letter = str1.charAt(i);

			switch (letter) {
			case 'M':
				lastdecimal = calculatedecimal(1000, lastnumber, lastdecimal);
				lastnumber = 1000;
				break;
			case 'D':
				lastdecimal = calculatedecimal(500, lastnumber, lastdecimal);
				lastnumber = 500;
				break;
			case 'C':
				lastdecimal = calculatedecimal(100, lastnumber, lastdecimal);
				lastnumber = 100;
				break;
			case 'X':
				lastdecimal = calculatedecimal(10, lastnumber, lastdecimal);
				lastnumber = 10;
				break;
			case 'L':
				lastdecimal = calculatedecimal(50, lastnumber, lastdecimal);
				lastnumber = 50;
				break;
			case 'V':
				lastdecimal = calculatedecimal(5, lastnumber, lastdecimal);
				lastnumber = 5;
				break;
			case 'I':
				lastdecimal = calculatedecimal(1, lastnumber, lastdecimal);
				lastnumber = 1;
				break;
			}
		}

		System.out.println(lastdecimal);
	}

	private int calculatedecimal(int decimal, int lastnumber, int lastdecimal) {
		if (lastnumber > decimal) {
			return (lastdecimal - decimal);
		} else {
			return (lastdecimal + decimal);
		}
	}

}

public class RomanToDecimal {

	public static void main(String[] args) {
		System.out.println("Enter a roman number");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		Roman roman = new Roman();
		roman.conversion(str);

	}

}
