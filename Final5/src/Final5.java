//*********************************************************
//
// Final5.java
//
// Jonathan Boyd
// 
//
//**********************************************************
import java.util.Scanner;

class Final5
{
	public static void main(String args[])
	{
		String s1, s2;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first string");
		s1 = in.nextLine();
		
		
		System.out.println("Enter the second string");
		s2 = in.nextLine();
		
		
		if ( s1.equalsIgnoreCase(s2))
			System.out.println("Strings are equal.");
		
		else   
			System.out.println("Both strings are not equal.");
		
		
	}
}