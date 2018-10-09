//*********************************************************
//
// Jonathan Boyd
// Lab 8: Grading Quizzes
// 
// Grading.java
// A program that grades arithmetic quizzes
//
//**********************************************************
import java.util.Scanner;

public class Grading
{
	public static void main (String[] args)
	{
	
		String moreGrading = "y";
		
		
			Scanner scan = new Scanner(System.in);
			System.out.print("How many questions are on the quiz?");
			int numberQuestions = scan.nextInt();
			int[] key = new int[numberQuestions];
			
			double correctCounter = 0;
			
			System.out.print("Enter the answers one at a time.");
			
			for (int i=0; i<numberQuestions;i++)
			{
				key[i] = scan.nextInt();
			}
			
		while (moreGrading.equalsIgnoreCase("y"))
			{

			correctCounter = 0;
			
			Scanner scanA = new Scanner(System.in);
			
				System.out.print("Now enter the students answers one at a time: ");
				
				for (int i=0; i<numberQuestions; i++)
				{
					int answer = scan.nextInt();
					
					if (answer == key[i])
					{	
						correctCounter++;
					}
				}
				
				System.out.println("The number of correct answers is: " + correctCounter);
				System.out.println("\nThe percent of the correct answers is: " + ((correctCounter/numberQuestions)*100) + "%");
				
				System.out.println("Grade another quiz? (y/n)");
				moreGrading = scanA.nextLine();
				
				
			}
	
			System.out.println ("Thanks for using Gradetron2000");	
		
	}
}

