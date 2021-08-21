package com.bridgelabz;

import java.util.Scanner;

public class StopWatch {
		public static long startTime,stopTime;
		public static void startTimer()			//@function to start the timer
		{
			startTime=System.currentTimeMillis();   //to get current time in milliseconds from the system
			System.out.println("Stop watch started!");
			System.out.println("Start time is "+startTime+" milliseconds");
		}
		public static void stopTimer()		//@function to stop the timer
		{
			stopTime=System.currentTimeMillis();	 //to get current time in milliseconds from the system
			System.out.println("Stop watch stopped!");
			System.out.println("Stop time is "+stopTime+ " milliseconds");
		}
	
		public static long elapsedTime()  //@function to get the elapsed time
		{
			return stopTime-startTime;		//@returns the difference between start and stop time 
		}
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Press a number to start the timer");
			char n=sc.nextLine().charAt(0);
			if(Character.isDigit(n))
				startTimer();
			System.out.println("Press again a number to stop the timer");
			n=sc.nextLine().charAt(0);
			if(Character.isDigit(n))
			{
				stopTimer();
				System.out.println("the elapsed time between start and end is "+elapsedTime()+" milliseconds");
			}
			sc.close();
		}
}
