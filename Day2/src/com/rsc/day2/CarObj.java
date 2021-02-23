package com.rsc.day2;
import java.util.Scanner;
public class CarObj {	
		public void Accelerate(int speed) {
			if(speed>2000 && speed<=4000) 
			{
			System.out.println("Please service your vechcile as soon as possible!");			
			}
			else if(speed>100 && speed<=2000) {
			System.out.println("You are maintaining the correct speed for your vechile...");			
			}
			else if(speed>1 && speed<=100) {
			System.out.println("Enjoy your drive as much you can!!");
			}		
			else {
				System.out.println("Invalid input");
			}
			}		
public void Insurance(float month)
{
	
	if(month>6 && month<12)
	{
		System.out.println("Renew your insurance properly!");		
	}
	else if(month>3 && month<=6)
	{
		System.out.println("Your vechile is in proper insurance.....");		
	}	
}
			public static void main(String[] args) {
				
			Scanner sc=new Scanner(System.in);
			System.out.println("CAR DETAILS...\n-------------- ");				
			System.out.println("Model: ");
			String model=sc.nextLine();
			System.out.println("Year of release: ");
			int year=sc.nextInt();
			System.out.println("Manufacturer : ");
			String manufact=sc.next();
			System.out.println("Enter the speed : ");
			int speed=sc.nextInt();
			CarObj co=new CarObj();
			co.Accelerate(speed);
			System.out.println("Insured your vechile? yes/no : ");
			String a=sc.next();
			if(a.equals("yes")){
				System.out.println("Enter the month:");								
			}			
			else if(a.equals("no"))
			{
				System.out.println("Please insure your vehicle..");
			}
			else {
				System.out.println("Invalid input! Enter yes or no.");
			}
			float month=sc.nextFloat() ;
			
			
			co.Insurance(month);
			}


	}


