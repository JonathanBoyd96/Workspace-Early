//*********************************************************
//
// Jonathan Boyd
// Lab 5: Powers Of 2
// 
// Powersof2.java
// Print out as many powers of 2 as the user requests
//
//**********************************************************

import java.util.Scanner;

public class Powersof2
{
	public static void main(String[] args)
	{
		int numPowersOf2;        	//How many powers of 2 to compute
		int nextPowerOf2 = 1; 		//Current power of 2
		int exponent = 0;
		int powers = 0; 				//Exponent for current power of 2 -- this
                         			//also serves as a counter for the loop Scanner
		Scanner scan = new Scanner(System.in);
		System.out.println ("How many powers of 2 would you like printed?");
		numPowersOf2 = scan.nextInt ();
		
		//print a message saying how many powers of 2 will be printed
		//initialize exponent -- the first thing printed is 2 to the what?
		while (exponent <= numPowersOf2)
			{
			
			System.out.println ("Here are the first "+ numPowersOf2 +" powers of 2^" + exponent+ " is " + nextPowerOf2);
			
			nextPowerOf2 = nextPowerOf2 * 2;
			exponent++;
		
			}
		{
		//print out current power of 2
		//find next power of 2 -- how do you get this from the last one?
		//increment exponent
		}
	}
}