package com.sai;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		System.out.println("Enter a string or sentence");
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		reveachword(str);
	}

	private static void reveachword(String str) {
		String string[] = str.split(" ");
		String RevStr =" ";
		for(int i=0; i< string.length;i++)
		{
			String word =string[i];
			String Revword =" ";
			for(int j=word.length()-1;j>=0;j--)
			{
				Revword = Revword + word.charAt(j);
			}
			RevStr = RevStr + Revword + " ";
		}
		System.out.println("Original String :     " +str);
		System.out.println("Rev String is   :     " +RevStr);
		
		
	}
	
	
}
