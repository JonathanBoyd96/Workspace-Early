//*********************************************************
//
// Final8.java`
//
// Jonathan Boyd
//
//
//**********************************************************

import java.util.Scanner;

public class Final8
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the input you want to enter: ");
		int size = input.nextInt();
		
		int[] NumberArray = new int[size];
		int numberArray;
		int sum=0;
		
		System.out.print("Enter "+ size +" numbers: ");
		
		for(int i=0; i<=NumberArray.length; i++)
		{
			int[] numArr = null;
			
			numArr[i]=input.nextInt();
			sum = sum + numArr[i];
		}
		System.out.print("The sum of the numbers is: " + sum);
	}
}