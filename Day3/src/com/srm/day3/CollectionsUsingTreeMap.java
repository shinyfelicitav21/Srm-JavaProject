package com.srm.day3;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
public class CollectionsUsingTreeMap {

	public static   void main(String[] args) {
		
		TreeMap<Integer, String> tmap = new TreeMap<>();

		tmap.put(1003, "Revathi");
		tmap.put(1001, "James");
		tmap.put(1002, "Shilpa");
		tmap.put(1004, "Chris");

		        System.out.println("Customer map : " +  tmap);

		        
		        System.out.println("Total number of cutomers : " +  tmap.size());

		       
		        Integer id = 1004;
		        if( tmap.containsKey(id)) {
		            
		            String name =  tmap.get(id);
		            System.out.println("Employee with id " + id + " : " + name);
		        } else {
		            System.out.println("Employee does not exist with id : " + id);
		        }

		        System.out.println("-----------------------------------------------------------------");
		        System.out.println("First entry in  customer map : " + tmap.firstEntry());
		        System.out.println("Last entry in  customer map : " + tmap.lastEntry());

		      
		       
		    }
		

		    }
		
	


