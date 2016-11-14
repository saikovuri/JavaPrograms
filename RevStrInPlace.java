package com.sai;

public class RevStrInPlace {

	private static String revinplace(String str) {
		int l = str.length();
		char[] s = str.toCharArray();
		for (int i = 0; i < l / 2; i++) {
			char temp = s[i];
			s[i] = s[l - 1 - i];
			s[l - 1 - i] = temp;
		}
		return new String(s);

	}

	public static void main(String[] args) {
		System.out.println("Reverse of string 'reverse' is " +revinplace("reverse"));

	}

}
