//**********************************************************
//
// Jonathan Boyd
// Lab 2: Area and circumference of a circle
// 
// Circle.java
// Print the area of a circle with two different radii
//
//**********************************************************
import java.util.Scanner;

	public class Circle
	{
		public static void main(String[] args)
		{
			int radius1;
			int radius2;
			
			final double PI = 3.14159;
			
			System.out.println ("Input first radius");
			Scanner scanr = new Scanner (System.in);
			radius1 = scanr.nextInt();
			
			double area1 = PI * radius1 * radius1;
			double circumference1 = PI * radius1 * 2;
			
			radius2 = (2 * radius1);
			
			System.out.println("The area of a circle with radius " + radius1 +
			" is " + area1);
	
			System.out.println("The circumference of a circle with radius " + radius1 +
			" is " + circumference1);
			
			double area2 = PI * radius2 * radius2;
			double circumference2 = PI * radius2 * 2;
	
			System.out.println("The area of a circle with radius " + radius2 +
			" is " + area2);
	
			System.out.println("The circumference of a circle with radius " + radius2 +
			" is " + circumference2);
	
			double areachange = area2 / area1;
			double circumferencechange = circumference2 / circumference1;
	
			System.out.println("The change in growth in area is " + areachange);
			System.out.println("The change in growth in circumference is " + circumferencechange);
		
		}
	}