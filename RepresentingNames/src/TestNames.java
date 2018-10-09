//*********************************************************
//
// Jonathan Boyd
// Lab 4: Representing Names
// 
// TestName.java
// Write a class Name that stores a person’s first, middle, 
// and last names.
//
//**********************************************************

public class TestNames 
{
	public static void main (String[] args)
	{
		Name name1, name2;
		
		name1 = new Name("Billy", "Joe", "Bob");
		name2 = new Name("Mary", "Jane", "Watson");
		
		System.out.print ("Name 1: ");
		System.out.println (name1.firstMiddleLast());
		System.out.println (name2.firstMiddleLast());
		
		System.out.print ("Name 2: ");
		System.out.println (name1.lastFirstMiddle());
		System.out.println (name2.lastFirstMiddle());
		
		System.out.print ("Name 1 Initials: ");
		System.out.println (name1.initials());
		
		System.out.print ("Name 2 Initials: ");
		System.out.println (name2.initials());
		
		System.out.print ("Name 1 Length: ");
		System.out.println (name1.length());
		
		System.out.print ("Name 2 Length: ");
		System.out.println (name2.length());
		
		System.out.print ("Name 1 is equal to Name 2: ");
		System.out.println (name1.equals(name2));
	}
}
