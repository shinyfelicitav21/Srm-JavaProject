package com.srm.day3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class SortHashByKeyAndValue {

	public static void main(String[] args) {
		
	    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
	 
	   
	    hashmap.put(32,"Briyani");
	    hashmap.put(78,"Fried rice");
	    hashmap.put(56,"Falooda");
	    hashmap.put(46,"Muffins");
	    hashmap.put(99,"Grill");
	    hashmap.put(80,"Tandoori");
	 
	    System.out.println("Before Sorting: \n");
	    Set s = hashmap.entrySet();
	    Iterator iterator = s.iterator();
	    while(iterator.hasNext())
	    {
	        Map.Entry pair = (Map.Entry)iterator.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    }
	    System.out.println("---------------");
	    
	    Map<Integer, String> map = new TreeMap<Integer, String>(hashmap);     
	    System.out.println("After Sorting: \n");
	    Set set2 = map.entrySet();
	    Iterator iterator1 = set2.iterator();
	    while(iterator1.hasNext())
	    {
	        Map.Entry pair = (Map.Entry)iterator1.next();
	        System.out.print(pair.getKey() + ": ");
	        System.out.println(pair.getValue());
	    } 
	  }
	}

