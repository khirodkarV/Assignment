package com.ifelse;

public class ConsonantDigitSpchar {

	public static void main(String[] args) {
		char ch='.';
		if (((ch>=65)&&(ch<=90)||(ch>=90)&&(ch<=122)))
		{
		if ((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U')||(ch=='a')||(ch=='e')||(ch=='i')||(ch=='o')||(ch=='u'));
		System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
		 if ((ch>=48)&&(ch<=57))
		{System.out.println("digit");
		}
		 else
		 {
			 System.out.println("Special character");
		 }
			

	}

}
