package com.rsc.day2;
import java.util.Scanner;



class withdrawn implements Account,Process
{

void display()
{ 
	
int total=50000;
int a,b,balance;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the amount to be withdrawn:");
a=sc.nextInt();
System.out.println("Your amount is withdrawn.");
balance=total-a;
System.out.println("-------------------------");
System.out.println("Balance amount : "+ balance);
}

public void details()
{

	System.out.println("Multiple inheritance for processing bank account details..");
	System.out.println("----------------------------------------------------------");
String name,add;
int accno,date;
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name:");
name=sc.next();
System.out.println("Enter your acc.no:");
accno=sc.nextInt();
System.out.println("Enter your address:");
add=sc.next();
System.out.println("Enter the date:");
date=sc.nextInt();
}
public void calc()
{
int amount;
Scanner sc=new Scanner(System.in);

System.out.println("Enter the amount to be deposited:");
amount=sc.nextInt();
if(amount>10000&&amount<=50000)
{
System.out.println("Your amount is deposited!!!");
System.out.println("---------------------------");
}

else
{
System.out.println(" Invalid amount.");
}
}
}
public class Diamond
{
public static void main(String args[])
{
withdrawn wd=new withdrawn();
wd.details();
wd.calc();
wd.display();
}
}

	    
	

    
