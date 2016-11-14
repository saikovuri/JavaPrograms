package com.sai;

public class RemoveChars {

	private void removeSpecificChars(String string, String str) {
		int end = 0;
		boolean[] bool = new boolean[128];
		char[] orig = string.toCharArray();
		char[] c = str.toCharArray();
		for (int i = 0; i < c.length; i++) {
			bool[c[i]] = true;
		}

		for (int i = 0; i < orig.length; i++) {
			if (!bool[orig[i]])
				orig[end++] = orig[i];
		}

		for (int m = 0; m < end; m++) {
			System.out.print(orig[m]);
		}

	}

	public static void main(String[] args) {
		RemoveChars rc = new RemoveChars();
		rc.removeSpecificChars("my life is bad", "ylifeis");

	}

}
