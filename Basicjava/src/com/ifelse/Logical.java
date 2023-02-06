package com.ifelse;

import java.util.Scanner;

public class Logical {

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter the total marks");
	  float marks= sc.nextFloat();
	  
	  System.out.println("Enter best three marks");
	  float bestThree= sc.nextFloat();
	  
	  if((marks>85)||(bestThree>90))
	  {
		  System.out.println("Elegible for the college :");
	  }
	  else
	  {
		  System.out.println("Not elegible for the college");
	  }
	}

}
