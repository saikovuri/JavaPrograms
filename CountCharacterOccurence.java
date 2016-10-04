package com.sai;

import java.util.Scanner;

public class CountCharacterOccurence {

	public static void main(String[] args) {
	 Scanner scan = new Scanner(System.in);
	 
	 String c = scan.next();
		
		countchar(c);

	}

	private static void countchar(String c) {
	
		String str = "Java is java again java again";
		
		int count = str.length() - (str.replace(c, "").length()) ;
		System.out.println("Count is" +count );
		
	}

}
