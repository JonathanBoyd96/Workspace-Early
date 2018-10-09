//*********************************************************
//
// Jonathan Boyd
//
//**********************************************************

import java.util.Scanner;
public class LoopsExample
{
	public static void main (String[] args)
	{
	  	
	// while loop 
		int number = 1;
		int sum = 0;
		System.out.println("While loop");
		while (number <= 20)
		{
			System.out.print(number + " ");
			sum += number;
			number ++;
		}
		System.out.println("----> sum = " + sum);
		
	// do loop 
		System.out.println("Do loop");
		number = 1;
		sum = 0;
		do
		{
			System.out.print(number + " ");
			sum += number;
			number ++;
		} while (number <= 20);
		System.out.println("----> sum = " + sum);

	// for loop 
		System.out.println("For loop");
		sum = 0;
		for (number = 1; number <= 20; number+=2)
		{
			sum += number;
			System.out.print(number + " ");
		}
		System.out.println("----> sum =" + sum);

	}
}