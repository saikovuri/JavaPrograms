package com.sai;

import java.util.HashSet;
import java.util.Iterator;

//Program to display sub strings which are palindrome

public class SubStrPalCount {

	public void findpalin(String str) {
		String str1;
		String rev;
		HashSet<String> s = new HashSet<String>();
		for (int i = 0; i <= str.length(); i++) {
			for (int j = i + 1; j <= str.length(); j++) {
				str1 = str.substring(i, j);
				rev = reverse(str1);
				if (str1.equals(rev)) {
					s.add(str1);
				}
			}

		}
		Iterator<String> itr = s.iterator();
		{
			while (itr.hasNext()) {
				System.out.println(itr.next());
			}
		}

	}

	public String reverse(String revstr) {
		String rev1 = "";
		for (int i = revstr.length() - 1; i >= 0; i--) {
			rev1 = rev1 + revstr.charAt(i);
		}

		return rev1;

	}

	public static void main(String args[]) {
		SubStrPalCount sspc = new SubStrPalCount();

		sspc.findpalin("ababasls");

	}

}