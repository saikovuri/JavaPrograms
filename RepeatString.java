package com.sai;

public class RepeatString {

	public static void main(String[] args) {
		String str = repeat("sai", 4);
		System.out.println(str);

	}

	public static String repeat(String string, int i) {

		return new String(new char[i]).replace("\0", string);
	}

}
