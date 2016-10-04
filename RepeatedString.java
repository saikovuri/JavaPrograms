package com.sai;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        long numOfChar = 0 ;
        int numOfA = 0;
        int stringLength = s.length();
        
        for(int i=0; i<stringLength;i++ )
        {
        	if(s.charAt(i)=='a')
        	{
        		numOfA++;
        	}
        }
       long div = n /stringLength;
       long mod = n % stringLength;
       numOfChar = div * numOfA;
       
        for(int i=0; i< mod;i++)
        {
        	if(s.charAt(i)=='a')
        	{
        		numOfChar++;
        	}
        }
        
        System.out.println(numOfChar);
}
    

}