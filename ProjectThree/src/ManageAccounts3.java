//*********************************************************
//
// Jonathan Boyd
//
// Project 3: A Third project
//
// ManageAccounts3.java
//
//**********************************************************

import java.util.ArrayList;
import java.awt.Menu;


public class ManageAccounts3
{  

	public static void main(String[] args) 
	{ 
		
		ArrayList <Account3> transactions = new ArrayList (transactions);
		Menu PrintMenu;
		PrintMenu = new Menu ();
		PrintMenu.getMenu();
		
		for (int i=0; i < transactions.size(); i++)
		{
			Account3 trans = transactions.get(i);
			System.out.println(trans);
		}

	} 
}


