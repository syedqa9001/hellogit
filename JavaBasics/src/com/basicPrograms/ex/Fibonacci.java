package com.basicPrograms.ex;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number to find Fibonacci Series");
		
		Scanner sc = new Scanner(System.in);
		
		int count = sc.nextInt();
		
		sc.close();
		
		int n1=0,n2=1;
		
		System.out.println(+n1+  "\n " +n2);
		
		for(int i=2;i<count;i++)
		{
			int n3=n1+n2;
			
			System.out.println(" " +  n3 + " ");
			
			n1=n2;
			
			n2=n3;
			
		}
		
		

	}

}
