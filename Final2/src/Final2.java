//*********************************************************
//
// Final2.java
//
// Jonathan Boyd
// 
//
//**********************************************************
import java.util.Scanner;

class Final2 
{
	public static void main(String[] args) 
	  {
	    int n;
	 
	    Scanner input = new Scanner(System.in);
	    System.out.println("Input an integer");
	    n = input.nextInt(); 
	 
	    while (n!=0) 
	    {
	    System.out.println("You entered " + n);
	    System.out.println("Input an integer");
	    n = input.nextInt();
	    
	    while (n==0) 
	    {
	    System.out.println("You entered the correct integer!");
	    break;
	    }
	  }
	}
}