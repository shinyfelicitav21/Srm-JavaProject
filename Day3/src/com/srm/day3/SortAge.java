package com.srm.day3;
import java.util.Comparator;
public class SortAge implements Comparator<SortCustomer> {


	
	@Override
	public int compare(SortCustomer cus3, SortCustomer cus4) {
	String str1=String.valueOf(cus3.getAge());
	String str2=String.valueOf(cus4.getAge());
	int res=str1.compareTo(str2);
	return res;
	}
	}

