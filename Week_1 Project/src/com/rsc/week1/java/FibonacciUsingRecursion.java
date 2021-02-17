package com.rsc.week1.java;
import java.util.Scanner;
public class FibonacciUsingRecursion {
	public static void main(String[] args) {
	int n;
    
    System.out.println("Enter the number:");
    Scanner scanner = new Scanner(System.in);
    n = scanner.nextInt();
    System.out.println("Fibonacci series of the given number:");
    for (int i = 0; i<=n-1; ++i)
    {
       System.out.print(fibonaccinumber(i) + " ");
    }
 
    
}

    
     public static int fibonaccinumber(int n) {
     
if(n==0)
    return 0;
else if(n==1)
    return 1;
else
    return fibonaccinumber(n-1) + fibonaccinumber(n-2);
 
    } 
     
     
}


	

	



		
	


