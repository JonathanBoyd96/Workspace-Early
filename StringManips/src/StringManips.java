//**********************************************************
//
// Jonathan Boyd
// Lab 3: Working with strings
// 
// StringManips.java
// Test several methods for manipulating String objects.
//
//**********************************************************

import java.util.Scanner;

public class StringManips
{
	public static void main (String[] args)
	{
		String phrase = new String ("This is a String test.");
		int phraseLength;
		int middleIndex;
		String firstHalf;
		String secondHalf;
		String middle3;
		String switchedPhrase; 
		String city;
		String state;
		
		Scanner City = new Scanner (System.in);
		System.out.println("Enter your city");
		city = City.nextLine (); 
		
		city = city.toLowerCase();
		
		Scanner State = new Scanner (System.in);
		System.out.println("Enter your state");
		state = State.nextLine ();
		
		state = state.toUpperCase();
		
		phraseLength = phrase.length();
		middleIndex = phraseLength / 2;
		middle3 = phrase.substring(middleIndex -1, middleIndex +1);
		
		firstHalf = phrase.substring(0,middleIndex);
		secondHalf = phrase.substring(middleIndex, phraseLength);
		
		switchedPhrase = secondHalf.concat(firstHalf);
		switchedPhrase = phrase.replace(' ', '*');
		
		System.out.println (state + city + state);
		System.out.println ();
		System.out.println ("Original phrase: " + phrase);
		System.out.println ("Length of the phrase: " + phraseLength +
				" characters");
		System.out.println ("Index of the middle: " + middleIndex);
	
		System.out.println ("Character at the middle index: " +
			phrase.charAt(middleIndex));
		System.out.println ("Switched phrase: " + switchedPhrase);
		System.out.println ("The middle three charaters are " + middle3);
		System.out.println ();
		
		
	}
}