package com.ifelse;

import java.util.Scanner;

public class Ndestedswitch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 
		 System.out.print("enter the branch");
         String branch= sc.next();
         int sem;
         switch(branch)
         {
         case "CSE" : System.out.println("Enter semester");
         sem=sc.nextInt();
         switch (sem) 
         {
         case 1: System.out.println("Welcome to the first sem of CSE");
                 break;
         case 2: System.out.println("Welcome to the seond se, of CSE");
                break;
         }
         break;
         
         case "ELE" : System.out.println("Enter semester");
         sem= sc.nextInt();
         switch(sem) {
         case 1: System.out.println("Welcome to the first sem of ELE");
         break;}
         default : System.out.println("Enter the proper sem number");
         
         
         
         }

	}

}