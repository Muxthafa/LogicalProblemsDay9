package com.bridgelabz;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int n=sc.nextInt();	//takes an input
	int num=n;
	int rev=0,rem=0;
	sc.close();
	while(n!=0)
	{
		rem=n%10;					//takes reminder by applying modulos of a number using 10   
		rev=rev*10+rem;   			//multiply rev(initially 0) by 10 and add reminder 
		n=n/10;						//filter out last digit of input
	}
	System.out.println("Reverse of "+num+" is "+rev); //Eventually reverse variable contains the reverse of the number
}
}
