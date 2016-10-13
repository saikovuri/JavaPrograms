package com.sai;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TripletCompare {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a0 = in.nextInt();
		int a1 = in.nextInt();
		int a2 = in.nextInt();
		int b0 = in.nextInt();
		int b1 = in.nextInt();
		int b2 = in.nextInt();
		int aliceScore = 0;
		int bobScrore = 0;
		int[] alice = { a0, a1, a2 };
		int[] bob = { b0, b1, b2 };

		for (int i = 0; i < alice.length; i++) {
			if (alice[i] > bob[i])
				aliceScore++;

			if (alice[i] < bob[i])
				bobScrore++;

		}
		System.out.print(aliceScore + " " + bobScrore);
	}
}
