package com.rsc.week1.java;
import java.util.*;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
		System.out.println("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		//text=text.toLowerCase();
		System.out.println("The vowels are:");
	    	for (int i = 0; i < text.length(); ++i) 
	     	{
			    char ch=text.charAt(i);
			  
	          	if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
	        	{
	          	  
		            	System.out.print(ch);
	        	}
	          	//else
		      // {
			     //   System.out.println("is a consonant:" +ch);
	         	//}
		}
}
}
