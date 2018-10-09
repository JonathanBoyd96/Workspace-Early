//*********************************************************
//
// Jonathan Boyd
// Lab 5: Computing The Raise
// 
// Salary.java
// Computes the amount of a raise and the new
// salary for an employee.  The current salary
// and a performance rating (a String: "Excellent",
// "Good" or "Poor") are input.
//
//**********************************************************

import java.util.Scanner;

import java.text.NumberFormat;

public class Salary
{
	public static void main (String[] args)
	{
	
	double currentSalary;
	double raise = 0;
	double newSalary;
	int rating;
	
	// employee's current  salary
	// amount of the raise
	// new salary for the employee
	// performance rating
	
	Scanner scan = new Scanner(System.in);
	System.out.print ("Enter the current salary: ");
	currentSalary = scan.nextDouble();
	System.out.print ("Enter the performance rating (Excellent (1), Good (2), or Poor (3)): "); 
	
	rating = scan.nextInt();
	
	// Compute the raise using if ...
	
	if (rating == 1)
		raise = currentSalary * 0.06;
	else
	
		if (rating == 2)
			raise = currentSalary * 0.04;
		else
	
			if (rating == 3)
				raise = currentSalary * 0.015;
			else System.out.println ("Incorrect Rating");
	
	
	newSalary = currentSalary + raise;
	
	// Print the results
	
	NumberFormat money = NumberFormat.getCurrencyInstance(); System.out.println();
	
	System.out.println("Current Salary: " + money.format(currentSalary)); 
	System.out.println("Amount of your raise: " + money.format(raise)); 
	System.out.println( "Your new salary: " + money. format (newSalary) ); 
	System.out.println();
	}
}