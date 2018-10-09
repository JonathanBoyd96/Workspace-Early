//*********************************************************
//
// Jonathan Boyd
// Lab 5: Factorials
// 
// Factorials.java
// program that asks the user for a non-negative integer 
// and computes and prints the factorial of that integer
//
//**********************************************************

import java.util.Scanner;

public class Factorials 
{
	public static void main(String[] args)
	{
		int factorial = 1;
		int input;
		int number = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("Input a positive integer");
		input = scan.nextInt ();
		
		while (input <= 0)
		{
			System.out.println ("Please input a positive number");

			;
		}
		
		while (number <= input)
		{
			
			System.out.println ("The integers between 1 and "+ input + " are: "+ factorial);
			
			number++;
			factorial = factorial * number;
			
		
		}
	}
}