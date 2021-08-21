package com.bridgelabz;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the number:");
				int n=sc.nextInt();   //@input number 
				int i=1,first=0,second=1,next=0;
				sc.close();
				System.out.println("The fibonacci series for "+n+" numbers are");
				while(i<=n)
				{
					System.out.print(first+" ");
					next=first+second;  		//next variable to store the sum
					first=second;				//@parameter first stores previous value
					second=next;				//@parameter second stores next value
					i++;
				}

	}

}
