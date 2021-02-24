package com.srm.day3;
import java.util.Comparator;
public class SortName  implements Comparator<SortCustomer>{
	
public int compare(SortCustomer cus1, SortCustomer cus2) {
int res=cus1.getFirstName().compareTo(cus2.FirstName);
return res;
}

}