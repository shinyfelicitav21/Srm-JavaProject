package com.srm.day3;
import java.util.Scanner;
public class ReverseIntArray {

	public static void main(String[] args) {
	
     int counter, i=0, j=0, temp;
     int number[] = new int[100];
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the no.of.elements: ");
     counter = sc.nextInt();

     
for(i=0; i<counter; i++)
{
	System.out.print("Enter the array element " +(i+1)+" : ");
    number[i] = sc.nextInt();
}


j = i - 1;     
i = 0;         

while(i<j)
{
	temp = number[i];
   number[i] = number[j];
   number[j] = temp;
   i++;
   j--;
}

System.out.print("Reversed array: ");
for(i=0; i<counter; i++)
{
   System.out.print(number[i]+ "  ");
}       
}
}