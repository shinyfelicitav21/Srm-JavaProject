package com.srm.day3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedToArrayList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
	    ll.add("Royal Enfield");
	    ll.add("Pulsar");
	    ll.add("R15");
	    ll.add("Duke");

	    List myList = new ArrayList(ll);

	    for (Object bike : myList)
	      System.out.println(bike);
	  }
	

	}

