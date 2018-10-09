//**********************************************************
//
// Jonathan Boyd
// Lab 3: Rolling Dice
// 
// RollingDice.java
// Main method for rolling a pair of dice using the Dice.java class
//
//**********************************************************

public class RollingDice 
{
	public static void main (String args[])
	{	
		Dice dice;
		dice = new Dice();

		// Prints the values of both dice, along with the sum.
		System.out.println("The number on the first die is: "+dice.returnD1());
		System.out.println("The number on the second die is: "+dice.returnD2());
		System.out.println("The sum total of the two dice is: "+dice.sum());	
	}
}
