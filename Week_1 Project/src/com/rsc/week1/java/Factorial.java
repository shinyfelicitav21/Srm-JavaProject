package com.rsc.week1.java;
import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		int num, i, fact=1;
        Scanner sc = new Scanner(System.in);
		
        System.out.print("Enter a number:");
        num = sc.nextInt();
		
        for(i=num; i>0; i--)
        {
            fact = fact*i;
        }
		
        System.out.print("Factorial of " + num + " is " + fact);
	}
}

