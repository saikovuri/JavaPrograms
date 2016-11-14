package com.sai;

public class CompressedString {

	private String compressedstr(String str) {
		int l = str.length();
		int count = 0;
		StringBuffer compstr = new StringBuffer();

		for (int i = 0; i < l; i++) {
			count++;
			if (i + 1 >= l || str.charAt(i) != str.charAt(i + 1)) {
				compstr.append(str.charAt(i));
				compstr.append(count);
				count = 0;
			}

		}
		if (l > compstr.length()) {
			return compstr.toString();
		} else {
			return str;
		}

	}

	public static void main(String[] args) {
		CompressedString cs = new CompressedString();

		String str = cs.compressedstr("aaabbccccd");

		System.out.println(str);

	}

}
