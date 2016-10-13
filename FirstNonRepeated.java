package com.sai;

import java.util.Hashtable;
import java.util.Scanner;

public class FirstNonRepeated {

	public static void main(String args[]) {
		System.out.println("Enter the string: ");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char c = firstNonRepeatedChar(s);
		System.out.println("First non repeated character is :" + c);
		scan.close();
	}

	private static char firstNonRepeatedChar(String str) {

		Hashtable<Character, Integer> charhashtable = new Hashtable<Character, Integer>();
		int i, len;
		len = str.length();
		Character c;
		for (i = 0; i < len; i++) {
			c = str.charAt(i);
			if (charhashtable.containsKey(c)) {
				charhashtable.put(c, charhashtable.get(c) + 1);
			} else {
				charhashtable.put(c, 1);
			}

		}

		for (i = 0; i < len; i++) {
			c = str.charAt(i);

			if (charhashtable.get(c) == 1) {
				return c;
			}
		}
		return 0;

	}

}
