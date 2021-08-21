package com.bridgelabz;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt(); //takes input
		sc.close();
		int f=0; //flag to check if number is prime, initially set to false 
		if(n==2)
			System.out.println(n+" is a prime number"); // 2 is a prime number
		else if(n>2)
		{
			for(int i=2;i<n/2;i++)  //to iterate 
			{
				if(n%i==0) //if a number is divisible then it is set to prime
				{
					f=1;
					break;
				}
				    
			}
			if(f==0)   //check if it is prime or not
				System.out.println(n+" is a prime number");
			else
				System.out.println(n+" is not a prime number");
		}
		else 
			System.out.println("Enter number greater than 2");

	}

}
