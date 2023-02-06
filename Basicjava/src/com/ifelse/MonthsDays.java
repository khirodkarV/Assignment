package com.ifelse;

import java.util.Scanner;

public class MonthsDays {

	public static void main(String[] args) {
	 Scanner sc= new Scanner(System.in);
	 
	 System.out.println("Enter the months number");
	 int months = sc.nextInt();
	  
	 switch (months) 
	 {
	 case 1:
	 case 3:
	 case 5:
	 case 7:
	 case 8:
	 case 10:
	 case 12:System.out.println("31 days Months");
	        break;
	 case 4:
	 case 6:
	 case 9:
	 case 11: System.out.println("30 days months");
	      break;
	 case 2: System.out.println("enter year number");
	      int year= sc.nextInt();
	      if (year%4==0)
	      {
	    	  System.out.println("29 days month");
	 
	      }
	      else
	      {
	    	  System.out.println("28 days months");
	      }
	       
	 } 
	 
	 
		 
	 

	}

}
