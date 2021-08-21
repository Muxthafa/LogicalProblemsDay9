package com.bridgelabz;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CouponNumber {
	public static Random random = new Random();  //to generate random numbers
	public static int n;
	public static Set<Integer> unique=new HashSet<Integer>(); //to store n distinct numbers
    public static int  randomNumber()	//@function to get random integer
    {
    	return random.nextInt(10);        //returns random integer between 0 to 10
    }
    public static boolean process(int x)	//@function to check if the random number is present in coupon or not
    {
    	if(unique.contains(x))				//checks if random number present in set
    		return true;
    	else 
    		return false;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the total number of coupons: ");
		n=sc.nextInt();    //@input n indicates number of distinct numbers in coupon
       System.out.println("Enter the "+n+" distinct coupon numbers");
       for(int i=0;i<n;i++)
    	   unique.add(sc.nextInt());		//@hashset contains distinct coupon numbers
       int count=0,random_count=0;
       while(count<n)   //iterates till all numbers are obtained
       {
    	   while(true)
    	   {
    		   int x=randomNumber();    //get random number
    		   random_count++;			//count of random numbers
    		   boolean p=process(x);  //function call to check if random number is present
    		   if(p)
    			   break;
    	   }
    	   count++;   
       }
       System.out.println("Number of random numbers is "+random_count);
       
	}
}
