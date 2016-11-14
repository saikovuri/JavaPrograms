package com.sai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CarfaxSearch {

	public static void main(String[] args) throws IOException {


			System.out.println(carfaxSearch("the"));
		
	}

	private static String carfaxSearch(String str) {
		String words[] = { "cat", "dog", "the", "off", "fox", "bar", "foo", "car", "hack", "cup", "pen" };
		for (int i = 0; i < words.length; i++) {
			if (words[i].equals(str))
				return "Found";
		}
		return "Not Found";
	}
}
