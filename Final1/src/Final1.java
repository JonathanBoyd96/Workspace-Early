//*********************************************************
//
// Final1.java
//
// Jonathan Boyd
// 
//
//**********************************************************
import java.util.Scanner;

public class Final1
{
public static void main(String[] args) 
	{
    	int c;
    	int num;
    	
 	System.out.println("Enter an integer: ");

 	Scanner input = new Scanner(System.in);
 	
 	for (c = 1; c <= 10; c++) 
 		{
 			System.out.println(c);
 		}
 	
 	num = input.nextInt();
 	
 	System.out.println ("You Chose: " + num);
	}
}
