package com.sai;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CarfaxSearch {

	public static void main(String[] args) throws IOException {
		
       FileReader in = new FileReader("C:/Users/Sai Kovuri/Desktop/text.txt");
			    BufferedReader br = new BufferedReader(in);

			    while (br.readLine() != null) {
			    	String str1 =br.readLine();
			    	
			    System.out.println(carfaxSearch(str1));
			    }
			    in.close();
			 }

    private static String carfaxSearch(String str) {
	        String words[] = {"cat","dog","the","off","fox","bar","foo","car","hack","cup","pen"};
	        for(int i=0;i<words.length;i++){
	            if(words[i].equals(str))
	                return "Found";
	        }
	        return "Not Found";
	    }
}

