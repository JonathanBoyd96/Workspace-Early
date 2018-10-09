//**********************************************************
//
// Jonathan Boyd
// Lab 3: Cards
// 
// Cards.java
// Purpose: Defines some cards using the Rank enumerated type 
// and prints out info about them.
//
//**********************************************************
public class Cards	
{
	enum Rank {ace, two, three, four, five, six, seven, eight, nine, jack, queen, king}
	
	//******************************************************
	// Define some cards using the Rank enumerated type
	// and print out info about them.
	//******************************************************
 

		public static void main (String[] args)
		{
			Rank highcard;
			Rank facecard;
			Rank card1, card2;
			int card1Val, card2Val;
			
			highcard = Rank.king;
			facecard = Rank.jack;
			card1 = Rank.four;
			card2 = Rank.two;
			
			System.out.println ("A black jack hand " + card1.name() + " and "+ card2.name());
			
			card1Val = card1.ordinal() + 1;
			card2Val = card2.ordinal() + 1;
			
			System.out.println ("A two card hand: " + card1 + " and " + card2);
			
			System.out.println ("Hand value : " + (card1Val + card2Val));
			
		}
}
