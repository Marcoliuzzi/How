package model;

public class BobTheTrex
{
	//-------------Data member section-------------
	//they are always private
	//also called instance variables
	//these are special- they get a "default" value
	//all numbers => 0
	//boolean => false
	//Objects => null
	private String name;
	private double legCount;
	private int eyeCount;
	private int armCount;
	private int tailCount;
	private boolean swordCount;
	/**
	*Default constuctor for after the fact customization
	*AKA i dont know the info yet about the run
	*initailizing data members with "bad" values to be changed
	*/
	
	
	public BobTheTrex()
	{
		//Default values are 0 or null
		
	}
	/*Better constuctor when i know information for the object
	 * @param distance the distance ran.
	 */
	
	
	public BobTheTrex(String name)
	{
		this.name = name;
	}
	
	public BobTheTrex(String name, double legCount, int eyeCount,int armCount, int tailCount, boolean swordCount)
	{
		this.name = name;
		this.legCount = legCount;
		this.eyeCount = eyeCount;
		this.armCount = armCount;
		this.tailCount = tailCount;
		this.swordCount = swordCount;
	}
	//Getters
	public String getName()
	{
		return name;
	}
	public double getLegCount()
	{
		return legCount;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public int getTailCount()
	{
		return tailCount;
	}
	public boolean getSwordCount()
	{
		return swordCount;
	}
	//Setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLegCount(double legs)
	{
		this.legCount = legs;
	}
	public void setEyeCount(int eyes)
	{
		this.eyeCount = eyes;
	}
	public void setArmCount(int arms)
	{
		this.armCount = arms;
	}
	public void setTailCount(int tails)
	{
		this.tailCount = tails;
	}
	public void setSwordCount(boolean swords)
	{
		this.swordCount = swords;
	}
	
	
	public String toString()
	{
		String description = "This is" + name + " he has "
							 + swordCount + " swords";
		return description;
		
		
	}
	
	

}
