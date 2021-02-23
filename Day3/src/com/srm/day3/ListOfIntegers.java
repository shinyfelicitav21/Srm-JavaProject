package com.srm.day3;
import java.io.*;
import java.util.Scanner;
public class ListOfIntegers {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the no.of.elements:");
	int n=sc.nextInt();
	
	int a[]=new int[n];
	System.out.println("Enter the  elements:");
		   for(int i=0;i<n;i++)
		  {
			a[i]=sc.nextInt();
			//System.out.println(n);
	   	}
		  System.out.println("Odd numbers are:");
		  
		for(int i=0;i<n;i++)
		{
			if(a[i] % 2!=0)
			{
				System.out.println(a[i]);
			}
		}
			
	}

}


