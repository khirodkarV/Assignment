package com.ifelse;

import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the marks of the five subject :");
		float sub1= sc.nextFloat();
		float sub2= sc.nextFloat();
		float sub3= sc.nextFloat();
		float sub4= sc.nextFloat();
		float sub5= sc.nextFloat();
		
		float per=(sub1+sub2+sub3+sub4+sub5)/5;
		System.out.println("The percentage : " +per);
		 
		if (per>85)  {
			System.out.println("you are pass with grade A+");
			}
			else if (per>=75) {
				System.out.println("you are pass with grade A");
				}
				else if (per>65)
				      {System.out.println("You are passs with grade B");
				      } 
				     else if (per>36)
				     { System.out.println("you are pass with grade C");
				     }
				        else {
				        	 System.out.println("you are fail");}
	}
}

		



