//*********************************************************
//
// Final9Class.java
//
// Jonathan Boyd
//
//
//**********************************************************

import java.util.Scanner;

public class Final9Class 
{	
	String name;
	int items;
	Scanner scan = new Scanner (System.in);
	public void Person()
	{
		name = scan.nextLine();
		items = 0;
	}
	
	
	public void enterName()
	{
		System.out.println("Enter name: ");
				name = scan.nextLine();
	}
	
	
	public void enterItems()
	{
		System.out.println("Enter number of items: ");
				String items = scan.nextLine();
	}
	
	
	public String getName()
	{
		return name;
	}
	public void itemsReceived()
	{
		System.out.println("Enter number of items received: ");
		int itemsr = scan.nextInt();
	}
}
