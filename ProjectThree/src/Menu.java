//*********************************************************
//
// Jonathan Boyd
//
// Project 3: A Third project
//
// Menu.java
//
//**********************************************************

import java.util.Scanner;

public class Menu 
{
	
	public static void main (String[] args)
	{
		int choice;
		int gotBalanceCount = 0;
		int depositCount = 0;
		int withdrawCount = 0;
		int nameChangeCount = 0;
		int infoCount = 0;
		
		Account3 acct = new Account3 ("Ned", 4444, 1000);
		
		System.out.println("Welcome");
		
		Scanner scan = new Scanner(System.in);
		
		
		do
		{
		
			System.out.println("1. Get balance");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Change name");
			System.out.println("5. Quit");
			choice = scan.nextInt();
			if (choice == 1)
				infoCount++;
			else if (choice == 2)
				depositCount++;
			else if (choice == 3)
				withdrawCount++;
			else if (choice == 4)
				nameChangeCount++;
			switch (choice)
			{
					
			case 1: 
			{
				System.out.println(acct.getBalance());
				acct.getBalance();
				break;
			}
			case 2:
			{
				System.out.println("Enter an ammount to deposit");
				acct.deposit();
				System.out.println("Thank you for your deposit!");
				break;
			}
			case 3:
			{
				System.out.println("Enter an ammount to withdraw");
				acct.withdraw();
				System.out.println("Thank you for your withdraw!");
				break;
			}
			case 4:
			{
				System.out.println("Enter a new name");
				acct.changeName();
				System.out.println("Thank you for changing your name!");
				break;
			}
			case 5:
			{
				System.out.println("Summery of use: "
						+"\rGot Balance: " + gotBalanceCount
						+"\rDeposited: " + depositCount
						+"\rWithdrew: " + withdrawCount
						+"\rTimes Name Changed: " + nameChangeCount);
			}
			default:
			{
				System.out.println("Invalid Command");
			}
			
			
			
			}
			}
			while (choice !=5);
		}
		
	}
