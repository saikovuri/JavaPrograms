package com.sai;

import java.util.Scanner;

public class RevString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println(recursiverev(str));
		
	}

	private static String recursiverev(String str) {
	
		if(str ==null || str.length()<=1)
		{
			return str;
		}
		return recursiverev(str.substring(1))+str.charAt(0);
	}

}
