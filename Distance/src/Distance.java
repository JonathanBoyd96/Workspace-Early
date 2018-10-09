//*********************************************************
//
// Jonathan Boyd
// Lab 3: Computing distance
// 
// Distance.java
// Computes the distance between two points
//
//**********************************************************

import java.util.Scanner;

public class Distance 
{
	public static void main (String[] args)
	{
		double x1, y1, x2, y2; // coordinates of two points
		double distance;      // distance between the points
		
		Scanner scan = new Scanner(System.in);
		
		// Read in the two points
		System.out.println ("Enter the coordinates of the first point (put a space between them): ");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		
		
		System.out.println ("Enter the coordinates of the second point (with a space): ");
		x2 = scan.nextDouble();
		y2 = scan.nextDouble();
		
		distance = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		
		System.out.println ("The distance between the coordinates is: "+distance);
				
	}
	
}
