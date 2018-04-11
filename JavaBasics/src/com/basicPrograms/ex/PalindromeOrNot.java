package com.basicPrograms.ex;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number to Check Palindrome or Not");
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		int n=num,s=0,r;
		
		scan.close();
		
		int t=n;
		
		while(n>0)
		{
			r=n%10;
			
			n=n/10;
			
			s=s*10+r;
		}

		if(t==s)
		{
			System.out.println("Number is Palindrome: ");
		}else
		{
			System.out.println("Number is not Palindrome");
		}
		
	}

}
