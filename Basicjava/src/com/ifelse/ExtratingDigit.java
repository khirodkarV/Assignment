package com.ifelse;
public class ExtratingDigit {
public static void extract (int num) {
	System.out.println("The Digit are");
	while(num!=0)
	{
		int r= num%10;
		System.out.println(r);
		num=num/10;
	}
}

}
