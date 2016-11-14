package com.sai;

import java.util.Scanner;

public class CountwordsinString {

	public static void main(String[] args) {
		
		System.out.println("Enter a sentence: ");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] string = str.trim().split(" ");
		System.out.println(string.length);

	}

}
