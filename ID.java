//This is the ID class which will contain the name and description of the Character class.

public class ID
{
    private String name;
    private String description;
    
    public ID()
    {
        this.name = "";
        this.description = "";
    }//end DVC
    
    public ID(String name, String description)
    {
        this.name = name;
        this.description = description;
    }//end EVC
    
    //declaring the getters and setters 
    
    public String getName(String name)
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getDescription(String description)
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
        
    @Override
    public String toString()
    {
        return "Name: " + name + "\n" + 
               "Description: " + description + "\n";
    }
    
}//end ID
