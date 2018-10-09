//*********************************************************
//
// Jonathan Boyd
// Lab 5: Counting and looping
// 
// LoveCS.java
// 
// Use a while loop to print many messages declaring your
// passion for computer science
//
//**********************************************************

import java.util.Scanner;

public class LoveCS
{
	public static void main (String[] args)
	{
		
		int limit;
		int count2;
		int sum = 0;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println ("How many times should the message be printed? ");
		limit = scan.nextInt();
		
		int count = 1;
		while (count <= limit)
		{
			
			System.out.println ( count + " I love Computer Science!!");
			sum+=count;
			count++;
		
		}
		count2 = count - 1;
		
		System.out.println ("This message was printed " + count2 + " times");
		System.out.println("The sum of the numbers from 1 to " + count2 + " is: " + sum);
		
		
	}
}