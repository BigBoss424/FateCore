//This class is the aspects class in which it takes in four string values for the aspects of the character
//Should I define the maximum amount of characters in each string and how does one go about doing so? (Hint: Java API)
public class Aspects
{
    //Declaring variables
    private String aspectOne,
                   aspectTwo,
                   aspectThree,
                   aspectFour;
    public Aspects()
    {
        this.aspectOne = "";
        this.aspectTwo = "";
        this.aspectThree = "";
        this.aspectFour = "";
    }//end DVC
    
    public Aspects(String aspectOne, String aspectTwo, String aspectThree, String aspectFour)
    {
        this.aspectOne = aspectOne;
        this.aspectTwo = aspectTwo;
        this.aspectThree = aspectThree;
        this.aspectFour = aspectFour;
    }//end EVC
    
    //Declaring the getters and setters
    public String getAspectOne(String aspectOne)
    {
        return aspectOne;
    }
    
    public void setAspectOne(String aspectOne)
    {
        this.aspectOne = aspectOne;
    }
    
    public String getAspectTwo(String aspectTwo)
    {
        return aspectTwo;
    }
    
    public void setAspectTwo(String aspectTwo)
    {
        this.aspectTwo = aspectTwo;
    }
    
    public String getAspectThree(String aspectThree)
    {
        return aspectThree;
    }
    
    public void setAspectThree(String aspectThree)
    {
        this.aspectThree = aspectThree;
    }
    
    public String getAspectFour(String aspectFour)
    {
        return aspectFour;
    }
    
    public void setAspectFour(String aspectFour)
    {
        this.aspectFour = aspectFour;
    }
    //end Getters and Setters
    
    
    //implement a comparable interface as well as a equalsTo interface for comparing the aspects
    
    @Override
    public String toString()
    {
        return "Aspect 1: " + aspectOne + "\n" + 
               "Aspect 2: " + aspectTwo + "\n" + 
               "Aspect 3: " + aspectThree + "\n" + 
               "Aspect 4: " + aspectFour + "\n";
    }//end toString
}//end aspects class
