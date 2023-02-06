package com.ifelse;

import java.util.Scanner;

public class Bmi {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("weight in kilogram :");
		float weight =sc.nextFloat();
		System.out.println("input height feet :");
		float height =sc.nextFloat();
		height= height*0.3048f;
		
		float bmi= weight/(height*height);
		if (bmi<=18) {
			System.out.println("youn are Under weight");
			}
		else if (bmi>=24) {
			System.out.println("your weght is normal :");}
	
			}

	}


