package com.rsc.day1.java;
import java.io.*;
import java.util.*;
import java.lang.*;
public class StringReverse {

	public static void main(String[] args) {
		
	


     Scanner sc = new Scanner(System.in);
System.out.print("Enter a string:");
char[] letters = sc.nextLine().toCharArray();
System.out.print("Reversed string: ");
for (int i = letters.length - 1; i >= 0; i--) {
    System.out.print(letters[i]);
}
System.out.print("\n");

}
}