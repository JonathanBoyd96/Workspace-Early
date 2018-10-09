// ***************************************************************
//
// Jonathan Boyd
// Lab 8: Tracking Sales
//
// Sales.java
// Reads in and stores sales for each of 5 salespeople. 
// Displays sales entered by salesperson id and total sales 
// for all salespeople.
//
// ***************************************************************

import java.util.Scanner;

public class Sales
{
	public static void main (String[] args)
	{

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of salespeople");
		int salespeople = scan.nextInt();
		
		int[] sales = new int[salespeople];
		int sum;
		int maxSale = 0;
		int maxSeller = 0;
		int minSale = 999999999;
		int minSeller = 0;
		int salesExceed = 0;
		int salesCounter = 0;
		
		
		for (int i=0; i<sales.length; i++)
			{
				System.out.print("Enter sales for salesperson " + (i+1) + ": ");
				sales[i] = scan.nextInt();
				
				if (sales[i] > maxSale)
				{
					maxSale = sales[i];
					
					maxSeller = i;
				}
				
				if (sales[i] < minSale)
				{
					minSale = sales[i];
					
					minSeller = i;
				
				}
			}
		
		System.out.println("\nSalesperson  Sales");
		System.out.println(" ------------------ ");
		sum = 0;
		for (int i=0; i<sales.length; i++)
			{
				System.out.println("     " + (i+1) + "         " + sales[i]);
				sum += sales[i];
			}
		
		System.out.println("\nTotal Sales: " + sum);
		
		System.out.println("The average sale is: " + sum/5);
		
		System.out.println("\nThe highest sale was by Salesperson " + (maxSeller+1) + " and it was " + "$" + maxSale + ".");
		System.out.println();
		System.out.println("\nThe lowest sale was by Salesperson " + (minSeller+1) + " and it was " + "$" + minSale + ".");
		
		System.out.print("\nEnter a value, the ID of the salespeople who exceeded the value will be shown");
		
		salesExceed = scan.nextInt();
		
		System.out.println("\nThese are the salespeople that exceeded your ammount ");
		
		for (int i=0; i < sales.length; i++)
		{
			if (sales [i] > salesExceed)
			{
				System.out.println("\nSalesperson " + (i+1) + " and the sale was " + "$" + sales[i] );
				salesCounter++;
			}
		}
		
		System.out.println("\nThe total number of salespeople that exceeded your ammount is: " + salesCounter);
		
	}
}