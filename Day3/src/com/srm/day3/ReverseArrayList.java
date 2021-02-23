package com.srm.day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ReverseArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList(); 
		
        al.add("Shiny");         
        al.add("Sweety");        
        al.add("Sam");
        al.add("Shri");
        al.add("Deepa");         
        al.add("Kalai");
       
        System.out.println("Original array list:");         
        System.out.println(al);
         
        
        Collections.reverse(al);
         
        System.out.println("-----------------------------------------");
        System.out.println("Reversed array list:");         
        System.out.println(al);
    }

	}


