package com.rsc.day2;
import java.util.Scanner;

class productship
{
    private int pid=0;
	public void pricecal() {
	double weight,qty,price,basecost=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the product ID: ");
	pid=sc.nextInt();
	System.out.println("Enter the quantity of your product: ");
	qty=sc.nextInt();
	System.out.println("Enter the weight of your product in kg: ");
	weight=sc.nextFloat();
	if(weight>200) {
	System.out.println("We don't accept the package weighs more than 200KG");
	}
	else if(weight<=0 || qty<=0)
	{
	System.out.println("Invalid input!Negative numbers not accepted\n-----------------");
	}
	else if(weight >=150 || weight<=200 ) {
	basecost=15.95;
	System.out.println("BILL CALCULATION...");
	System.out.println("WEIGHT IN KG: " +weight);
	System.out.println("QUANTITY: " +qty);
	price =qty*basecost;
	System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=100 || weight<150) {
	basecost=12.95;
	System.out.println("BILL CALCULATION...");
	System.out.println("WEIGHT IN KG: " +weight);
	System.out.println("QUANTITY: " +qty);
	price =qty*basecost;
	System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=50 || weight<100) {
	basecost=9.95;
	System.out.println("BILL CALCULATION...");
	System.out.println("WEIGHT IN KG: " +weight);
	System.out.println("QUANTITY: " +qty);
	price =qty*basecost;
	System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=30 || weight<50) {
	basecost=7.95;
	System.out.println("BILL CALCULATION...\n----------------");
	System.out.println("WEIGHT IN KG: " +weight);
	System.out.println("QUANTITY: " +qty);
	price =qty*basecost;
	System.out.println("TOTAL COST: "+price);
	}
	else if(weight>=1 || weight<30) {
	basecost=4.95;
	System.out.println("BILL CALCULATION...");
	System.out.println("WEIGHT IN KG: " +weight);
	System.out.println("QUANTITY: " +qty);
	price =qty*basecost;
	System.out.println("TOTAL COST: "+price);
	}

	else {
	System.out.println("Invalid input!");
	}
	}
	}
	public class ShippingModule {
	public static void main(String[] args) {
	String pname,from,to;
	Scanner sc = new Scanner(System.in);
	System.out.println("PRODUCT SHIPPING ...\n ---------------" );
	System.out.println("Enter the product name: ");
	pname=sc.nextLine();
	System.out.println("Where will you start from: ");
	from=sc.nextLine();
	System.out.println("Where  to sent it: ");
	to=sc.nextLine();
	System.out.println("PRODUCT NAME: " +pname);
	System.out.println("FROM: " +from);
	System.out.println("TO: " +to);
	productship ps = new  productship();
	ps.pricecal();
	}
	
		

	}


