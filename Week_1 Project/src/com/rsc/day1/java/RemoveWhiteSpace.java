package com.rsc.day1.java;
import java.util.Scanner;
public class RemoveWhiteSpace {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the input string:");
		
		String str = sc.nextLine();
		
		String str1 =str.replaceAll("\s+", "");
		
		
		
		System.out.println("String without spaces: "+str1);
		
		
	}

}
