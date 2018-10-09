//**********************************************************
//
// Jonathan Boyd
// Lab 2: Ideal Weight
// 
// IdealWeight.java
// Computes the ideal weight of males and females.
//
//**********************************************************

import java.util.Scanner;

public class IdealWeight 
{
	public static void main (String[] args)
	{
		
		int heightft;
		int heightin;
		
		Scanner scanf = new Scanner(System.in);
		System.out.print ("Enter your height in feet");
		
		heightft = scanf.nextInt ();
		
		Scanner scani = new Scanner(System.in);
		System.out.print ("Enter the remaining inches");
		
		heightin = scani.nextInt ();
		
		int totalheight = (12 * heightft) + heightin;
		
		int MIdealWeight = 106 + (6 * (totalheight - 60));
		
		int FIdealWeight = 100 + (5 * (totalheight - 60));
		
		
		System.out.println("The ideal weight for a male that is " + 
		totalheight + " inches tall is "+ MIdealWeight + " pounds");
	
		System.out.println("The ideal weight for a female that is " + 
		totalheight + " inches tall is "+ FIdealWeight + " pounds");
	
	
	}	
	
}