//*********************************************************
//
// Final6
//
// Jonathan Boyd
//
//
//**********************************************************

import java.util.Scanner;

 public class Final6
{
	 public static void main(String[] args)
	 {
		 int inum1=0;
		 int inum2=0;
		 
		 Scanner input = new Scanner(System.in);
		 System.out.print("Enter a number: ");
		 String snum1 = input.nextLine(); 
		 
		 System.out.print("Enter another number: ");
		 String snum2 = input.nextLine();
		 
		 inum1 = (Integer.parseInt(snum1));
		 inum2 = (Integer.parseInt(snum2));
		 
		 System.out.println("The sum is: " + (inum1 + inum2));
	 }
}
