package com.ifelse;

import java.util.Scanner;

public class Voting {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Enter the age of candidate :");
		int age= sc.nextInt ();
		if (age>=18) {
			System.out.println("you are eligible for voting ");
		} else {
			System.out.println("yo are not elegible for voting");
			
		}
		
		

	}

}
