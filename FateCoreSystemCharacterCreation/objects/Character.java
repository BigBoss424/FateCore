//This is the parent class
public class Character
{
      //Gotta create all these classes below 
      //Class variables
      ID id;
      //Aspects aspect;
      //Skills skills;
      //Will will;
      //Extras extra;
      //Physique physical;
      //Stunts stunts;
      //Consequences consequence;
      */
      //Class local variables
      private String name, 
                     description;

      public Character()
      {

            this.id = name + description;
      }

      public Character(String name, String description, ID id)
      {
            this.name = name;
            this.description = description;
            this.id = id;
      }

      
      public void setDescription(String description)
      {
            this.description = description;
      }
      
      public ID getID(ID id)
      {
            return id;
      }

      public void setID(ID id)
      {
            this.id = id;
      }
      
      /*public int compareTo()
      {

      }*/

      /*public void equalsTo()
      {

      }*/

      @Override
      public String toString()
      {
            return "Name: " + name + "\n" +
                   "Description: " + description + "\n" +
                   "" 
      }
}
