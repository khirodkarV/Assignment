package com.ifelse;

import java.util.Scanner;

public class Character {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char ch;
		System.out.println("Enter the character :");
		 ch=sc.next().charAt(0);
		 
		 if ((ch>='A')&&(ch<='Z'))
		 System.out.println("Capatial letters");
		 else if ((ch>='a')&&(ch<='z'))
			 System.out.println("Small letters");
		 else if  ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'));
		 {  System.out.println("Letters are vovels");
		 } 
		       System.out.println("Consonent");
		
	}

}
