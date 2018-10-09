//*********************************************************
//
// Jonathan Boyd
// Lab 8: 
// 
// ReverseOrder.java
// A bank account class with methods to deposit to, 
// withdraw from, change the name on, charge a fee to, 
// and print a summary of the account.
//
//**********************************************************

import java.util.Scanner;

public class ReverseOrder 
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		double[] numbers = new double [10];
		
		System.out.println ("The size of the array: " + numbers.length);

		for (int index = 0; index < numbers.length; index++)
		{
			System.out.print("Enter number " + (index+1) + ": ");
	         numbers[index] = scan.nextDouble();
		}
		
		System.out.println ("The numbers in reverse order: ");
		
		
		for (int index = 0; index < numbers.length/2; index++)
		{
			double holder = numbers [index];
			numbers [index] = numbers [numbers.length-index-1];
			numbers[numbers.length-index-1] = holder;
			
		}
		
		System.out.println ("");
		System.out.println ("");
		System.out.println ("The new array is: ");
		
		for (int index = 0; index< numbers.length; index++)
			System.out.print (numbers[index]+ "  ");
	}
			
}
