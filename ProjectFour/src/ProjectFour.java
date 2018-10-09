//*********************************************************
//
// Jonathan Boyd
// Project Four
// 
// ProjectFour.java
// Another Project
//
//**********************************************************
import java.io.*;
import java.util.Scanner;

public class ProjectFour
{
	public static void main(String[] args) throws IOException
	{
		final int max = 10;
		String [] Names = new String [max];
		Scanner scan = new Scanner (System.in);
		double quiz1, quiz2, quiz3, avg;
		StudentAverage[] person = new StudentAverage[max];

        System.out.print("Enter name of file: ");
        String fileName = scan.nextLine();

        FileReader fr = new FileReader(new File (fileName));
        BufferedReader br = new BufferedReader(fr);
  
        int index = 0;
        String line = br.readLine();
        while(line != null)
        {
        	System.out.println(line);
            String temp[] = line.split(" ");
            String name = temp[0];
            Names[index] = name;
            quiz1 = Double.parseDouble(temp[1]);
            quiz2 = Double.parseDouble(temp[2]);
            quiz3 = Double.parseDouble(temp[3]);
            avg = (quiz1+quiz2+quiz3)/3;
            StudentAverage nt = new StudentAverage(name, avg);
            person[index] = nt;
            index++;
            line = br.readLine();
            
        }
        
        System.out.println("Enter The Name of A Student: ");
        String inp = scan.next();
        boolean isFound = false;
        
        for(int i = 0; i < Names.length; i++)
        {
            if(Names[i].equals(inp))
            {
                System.out.println("Name \t Average");
                System.out.println("*************************");
                System.out.println(person[i]);
                isFound = true;
                break;
            }
        }
        if(!isFound)
            System.out.println("Student not Found.");
	}
}




