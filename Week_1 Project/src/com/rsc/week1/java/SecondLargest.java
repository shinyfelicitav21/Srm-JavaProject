package com.rsc.week1.java;
import java.util.Scanner;
public class SecondLargest {

	public static void main(String[] args) {
		int n, temp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter  the elements:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Second largest element in the array:"+a[n-2]);
       
    }


	}


