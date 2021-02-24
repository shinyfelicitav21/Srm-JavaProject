package com.srm.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortCustomer{
String FirstName,LastName,Email;
int Age;
SortCustomer(String FirstName,String LastName,String Email,int Age)
{
this.FirstName=FirstName;
this.LastName=LastName;
this.Email=Email;
this.Age=Age;
}
public String toString()
{
return FirstName+" "+LastName+" "+Email+" "+Age;
}
public String getFirstName() {
return FirstName;
}
public void setFirstName(String firstName) {
FirstName = firstName;
}
public String getLastName() {
return LastName;
}
public void setLastName(String lastName) {
LastName = lastName;
}
public String getEmail() {
return Email;
}
public void setEmail(String email) {
Email = email;
}
public int getAge() {
return Age;
}
public void setAge(int age) {
Age = age;
}
//
static void sortmyData(ArrayList al)
{
Collections.sort(al,new SortName().thenComparing(new SortAge()).reversed());
System.out.println(al);  
}
public static void main(String[] args) {

String FirstName,LastName,Email;
int Age;
Scanner sc = new Scanner(System.in);
ArrayList list=new ArrayList();
System.out.println("Enter the size of the list : ");
int lsize=sc.nextInt();

for(int j=0;j<lsize;j++) {
System.out.println("Enter the first name: ");
FirstName=(sc.next());
System.out.println("Enter the last name: ");
LastName=(sc.next());
System.out.println("Enter the email.id: ");
Email=(sc.next());
System.out.println("Enter the age: ");
Age=(sc.nextInt());
list.add(new SortCustomer(FirstName, LastName, Email, Age));
}
sortmyData(list);
}



	}


