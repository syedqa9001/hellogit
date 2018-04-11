package com.basicPrograms.ex;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		String rev="";
		
		System.out.println("Enter the Number to See the Reverse of it");
		
		Scanner sc = new Scanner(System.in);
		
		String Original	= sc.nextLine();
		
		sc.close();
		
		int length = Original.length();
		
		for(int i=length-1;i>=0;i--)
		{
			rev = rev + Original.charAt(i);
			
			System.out.println("The Reverse of String is : " +rev);
		}
		
		
		
		

	}

}
