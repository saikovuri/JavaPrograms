package com.sai;

public class IsUnique {

	private static boolean isUnique(String str) {
		if (str.length() > 128) {
			return false;
		}
		boolean[] bool = new boolean[128];

		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (bool[val]) {
				
				return false;
			}
			bool[val] = true;

		}

		return true;
	}

	public static void main(String[] args) {
		String str = "abcc";
		boolean x = isUnique(str);
		if (x == true) {
			System.out.println("Its Unique");
		} else {
			System.out.println("Not Unique");
		}

	}

}
