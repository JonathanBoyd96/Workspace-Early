//*********************************************************
//
// Jonathan Boyd
// Lab 8: Reversing an array
// 
// Reverse.java
// A program that reverses arrays
//
//**********************************************************
import java.util.Scanner;

public class Reverse 
{
	public static void main (String[] args)
	{
		System.out.println("Enter an interger");
		
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		
		System.out.println("Please enter " + input + " Values");
		int[] values = new int[input];
		
		for (int i=0; i<values;i++)
		{
			input[i] = scan.nextInt();
		}
		
	}
}
