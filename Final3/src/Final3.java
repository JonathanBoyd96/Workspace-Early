//*********************************************************
//
// Final3.java
//
// Jonathan Boyd
// 
//
//**********************************************************

import java.util.*;
 
class Final3 
{
	public static void main(String[] args) 
	{
		int temperature;
		
		Scanner in = new Scanner(System.in);     
		System.out.println("Enter temperature in Fahrenheit");
		temperature = in.nextInt();
		
		temperature = (temperature - 32)*5/9;
		System.out.println("Temperature in Celsius = " + temperature);
	}
}