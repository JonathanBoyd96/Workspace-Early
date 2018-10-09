//*********************************************************
//
// Final7.java
//
// Jonathan Boyd
//
//
//**********************************************************

import java.util.Scanner;

public class Final7 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("--Select a Choice Below--");
		System.out.println("Press [1]: If your Pet can fly but cannot talk.");
		System.out.println("Press [2]: If your Pet cannot fly but can talk.");
		System.out.println("Press [3]: If your Pet cannot fly but can swim.");
		System.out.println("Press [4]: If your Pet cannot fly and cannot swim .");
		System.out.println();
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		
		
		switch(choice)
		{
		case 1: System.out.println("Your Pet is an EAGLE!");
		break;
		case 2: System.out.println("Your Pet is a PARROT!");
		break;
		case 3: System.out.println("Your Pet is a DUCK!");
		break;
		case 4: System.out.println("Your Pet is a CHICKEN!");
		break;
		default:System.out.println("Program Error...:D");
		break;
		}
	}
}
