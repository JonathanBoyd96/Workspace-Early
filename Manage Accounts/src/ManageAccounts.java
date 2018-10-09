//**********************************************************
//
//Jonathan Boyd
//Lab 3: A Bank Account Manager
//
//ManageAccounts.java
// UseAccountclasstocreateandmanageSallyandJoe's 
// bank accounts.
//
//**********************************************************
public class ManageAccounts
{
	public static void main(String[] args)
	{
		Account acct1, acct2;
		//create account1 for Sally with $1000
		
		acct1 = new Account(1000, "Sally", 1111);
		
		//create account2 for Joe with $500
		acct2 = new Account (500, "Joe", 2233);
		
		//deposit $100 to Joe's account
		acct2.deposit(100);
		
		//print Joe's new balance (use getBalance())
		System.out.println ("Joe's balance is " + acct2.getBalance());
		
		//withdraw $50 from Sally's account
		acct1.withdraw(50);
		
		//print Sally's new balance (use getBalance())
		System.out.println ("Sally's balance is " + acct1.getBalance());
		
		//charge fees to both accounts
		acct1.chargeFee(12); 
		acct2.chargeFee(12);
		
		//change the name on Joe's account to Joseph
		
		
		//print summary for both accounts
	}
}