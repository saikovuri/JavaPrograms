package com.sai;

import java.util.HashMap;

public class Anagram {

	private static boolean AnagramCal(String a, String b) {

		String str1 = a.replaceAll("\\s", "");
		String str2 = b.replaceAll("\\s", "");

		if (str1.length() != str2.length()) {
			return false;
		}
		char[] c1 = str1.toCharArray();
		char[] c2 = str2.toCharArray();

		HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();

		for (char c : c1) {
			int count = 1;
			if (h1.containsKey(c)) {
				count = h1.get(c) + 1;
			}
			h1.put(c, count);

		}

		for (char c : c2) {
			int count = 0;
			if (h1.containsKey(c)) {
				count = h1.get(c) - 1;
			}
			h1.put(c, count);

		}

		for (char c : h1.keySet()) {
			if (h1.get(c) != 0) {
				return false;
			}
		}
		return true;

	}

	public static void main(String[] args) {
		String a = "mary";
		String b = "army";
		boolean x = AnagramCal(a, b);
		if (x == true) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not anagram");
		}

	}

}
