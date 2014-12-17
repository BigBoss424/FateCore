/*
This class will be a simple description consisting of either a string description or a 
character description. 

Created by: Aaron Jones
*/

public class Extras
{
	private String description;

	/*
		Should I create a character value rather than a String? 
		Should I put a limit on how long the characters are in 
		the description? 
		We'll see when things are finished. 
	*/
	public Extras()
	{
		this.description = "";
	}//end DVC

	public Extras(String description)
	{
		this.description = description;
	}//end EVC


	//Declaring getter and setters 
	public String getDescription(String description)
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = descripton;
	}
	

	@Override
	public String toString()
	{
		return "Extras: " + description;
	} //end toString
	
}
