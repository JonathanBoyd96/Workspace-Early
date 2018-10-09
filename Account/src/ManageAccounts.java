import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

//**********************************************************
//
// Jonathan Boyd
// Lab 4: A Bank Account Manager
//
// ManageAccounts.java
// UseAccountclasstocreateandmanageSallyandJoe's 
// bank accounts.
//
//**********************************************************
public class ManageAccounts
{
	public static void main(String[] args) throws IOException
	{
		
		Account acct;
		
		Scanner fileScan, lineScan;
		String fileName;
		String line;          //a line from the file
		String action, name;
		double number, sum;
		Double amount;
		String amountStr;
		String balanceStr;
		Double balance = null;
		long num = 0;
		String acctnum = null;

		Scanner scan = new Scanner (System.in);
		System.out.print ("Enter the name of the input file: ");
		fileName = scan.nextLine();
		fileScan = new Scanner (new File(fileName));

		// Read and process each line of the file
		while (fileScan.hasNext())
		{
			line = fileScan.nextLine();
			lineScan = new Scanner(line);
			lineScan.useDelimiter(",");
			name = lineScan.next();
			acct = new Account (balance, name, acctnum);
			balanceStr = lineScan.next();
			balance = Double.parseDouble(balanceStr);
		
			sum = 0;
			System.out.println(name);
			while (lineScan.hasNext())
		    	{
				action = lineScan.next();
				amountStr = lineScan.next();
				amount = Double.parseDouble(amountStr);
				if (action.equals ("d"))
					acct.deposit (amount);
				else
					if (action.equals("w"))
					acct.withdraw (amount);
				
	           }
			System.out.println ("   sum: " + sum);
           }	
   }
}