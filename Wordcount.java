package com.sai;

import java.util.HashMap;
import java.util.Set;

public class Wordcount {

	public static void main(String[] args) {
		duplicatewordcount dw = new duplicatewordcount();
		dw.duplicatecount("This is is a good thing in the is");

	}

}
class duplicatewordcount{

	public void duplicatecount(String string) {
		
		String[] words = string.split(" ");
		HashMap<String,Integer> hashmap =new HashMap<String, Integer>();
		for(String word : words)
		{
			if(hashmap.containsKey(word.toLowerCase()))
			{
				hashmap.put(word.toLowerCase(), hashmap.get(word.toLowerCase())+1);
			}
			else
			{
				hashmap.put(word.toLowerCase(),1);
			}
		}
		
		Set<String> sets = hashmap.keySet();
		
		for(String set: sets)
		{
			if(hashmap.get(set)>1)
			{
				System.out.println(set +":" +hashmap.get(set)  );
			}
		}
		
		
		
		
		
		
		
	}
	
	
}