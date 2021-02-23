package com.srm.day3;

	import java.util.Map;
	import java.util.TreeMap;
public class CollectionsUsingTreeMap {

	public static  <FileExtensions> void main(String[] args) {
		


		  
		        
		       
		           
		            
		            
		        

		

		
		        TreeMap<Integer, String> customer = new TreeMap<>();

		        customer.put(1003, "Rajeev");
		        customer.put(1001, "James");
		        customer.put(1002, "Sachin");
		        customer.put(1004, "Chris");

		        System.out.println("Customer map : " +  customer);

		        
		        System.out.println("Total number of employees : " +  customer.size());

		       
		        Integer id = 1004;
		        if( customer.containsKey(id)) {
		            
		            String name =  customer.get(id);
		            System.out.println("Employee with id " + id + " : " + name);
		        } else {
		            System.out.println("Employee does not exist with id : " + id);
		        }

		        System.out.println("----------------------------------------------------------------");
		        System.out.println("First entry in  customer map : " +  customer.firstEntry());
		        System.out.println("Last entry in  customer map : " +  customer.lastEntry());

		        
		       
		    }
		

		    }
		
	


