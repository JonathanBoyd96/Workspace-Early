//**********************************************************
//
// Jonathan Boyd
// Lab: Project One
// 
// ProjectOne.java
// first project
//
//**********************************************************

import java.util.Scanner;

public class ProjectOne 
{
	public static void main (String[] args)
	{
		int rhour2;
		int rmin2;
		int sec3;
		int min2;
		int hour2;
		int sec2;
		int TimeInSec;
		int hour1;
		int min1;
		int sec1;
		int hour;
		int min;
		int sec;
		
		Scanner scanh = new Scanner(System.in);
		System.out.print ("Enter hours");
		
		hour = scanh.nextInt ();
		
		Scanner scanm = new Scanner(System.in);
		System.out.print ("Enter minutes");
		
		min = scanm.nextInt ();
		
		Scanner scans = new Scanner(System.in);
		System.out.print ("Enter seconds");
		
		sec = scans.nextInt ();
		
		hour1 = hour * 3600;
		min1 = min * 60;
		sec1 = sec * 1;
		
		TimeInSec = hour1 + min1 + sec1;
		
		System.out.println ("The total time in seconds is " + TimeInSec);
		
		Scanner scans1 = new Scanner(System.in);
		System.out.print ("Enter seconds");
		
		sec2 = scans1.nextInt ();
		
		hour2 = sec2 / 3600;
		rhour2 = sec2 % 3600;
		
		min2 = rhour2 / 60;
		rmin2 = rhour2 % 60;
				
		sec3 = rmin2 % 60;
		
		System.out.println ("The total time is " + hour2 + " hours " + min2 + 
		" minutes and " + sec3 + " seconds");
		
		
	}
}
