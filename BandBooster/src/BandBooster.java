//*********************************************************
//
// Jonathan Boyd
// Lab 4: Band Booster Class
// 
// BandBooster.java
// Writes a class that models a band booster and uses the 
// class to update sales of band candy.
//
//**********************************************************

public class BandBooster 
{
	private String name;
	int boxesSold;
	String getName;
	int updateSales;
	
	public BandBooster (String newName)
	{
		name = newName;
		boxesSold = 0;
	}
	
	public String getName (String getName)
	{
		return name;
	}
	
	public int updateSales (int boxes)
	{
		boxesSold = boxesSold + boxes;
		return boxesSold;
	}
	
	public String toString()
	{
		return name + ":" + boxesSold;
	}
}
