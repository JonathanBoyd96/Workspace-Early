//**************************************************************
//
// Jonathan Boyd
// Lab 5: Baseball Statistics
// 
// BaseballStats.java
// Reads baseball stats from a file and counts
//  total hits, outs, walks, and sacrifice flies
//  for each player.
//
//***************************************************************

import java.util.Scanner;
import java.io.*;

public class BaseballStats 
{
	public static void main (String[] args) throws IOException
	{
		Scanner fileScan, lineScan;
		String fileName;
		Scanner scan = new Scanner(System.in);
		// Read and process each line of the file
		System.out.print ("Enter the name of the input file: ");
		fileName = scan.nextLine();
		
		fileScan = new Scanner(new File(fileName));
		
		while (fileScan.hasNext())
		{
			String line = fileScan.nextLine();
			lineScan = new Scanner (line);
			lineScan.useDelimiter(",");
			String name = lineScan.next();
			
			double hits = 0;
			double outs = 0;
			int walks = 0; 
			int sacrifices = 0;
			double total;
			double battingAverage;
			
			System.out.println ("Player name " + name);
			
			while (lineScan.hasNext())
			{
				String stats = lineScan.next();
				
				for (int i=0; i<stats.length(); i++)
				{
					if (stats.charAt(i) == 'h')
							{
								hits++;
							}
					else
						if (stats.charAt(i) == 'o')
								{
									outs++;
								}
						else
							if (stats.charAt(i) == 'w')
									{
										walks++;
									}
							else
								if (stats.charAt(i) == 's')
										{
											sacrifices++;
										}
							
				}
			}
			
		total = hits + outs;
		battingAverage = hits/total;
		
		System.out.println("Hits: " + hits + "\nOuts: " + outs + "\nWalks: " + walks + "\nSacrifices: "+ sacrifices + "\nBattingAverage: " + battingAverage);
		System.out.println();
		}
		
		
	}
}
