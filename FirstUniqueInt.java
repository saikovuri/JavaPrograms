package com.topcoder.easy;

import java.util.Hashtable;

public class FirstUniqueInt {
		public static void main(String args[]) {
			int[] arr ={1,1,2,2,3,3,4,5};
			int c = firstNonRepeatedChar(arr);
			System.out.println("First non repeated character is :" + c);
			
		}

		private static int firstNonRepeatedChar(int[] a) {

			Hashtable<Integer, Integer> charhashtable = new Hashtable<Integer, Integer>();
			int i, len;
			len = a.length;
			
			for (i = 0; i < len; i++) {
				int c = a[i];
				if (charhashtable.containsKey(c)) {
					charhashtable.put(c, charhashtable.get(c) + 1);
				} else {
					charhashtable.put(c, 1);
				}

			}

			for (i = 0; i < len; i++) {
				int c = a[i];

				if (charhashtable.get(c) == 1) {
					return c;
				}
			}
			return 0;

		}

	}



