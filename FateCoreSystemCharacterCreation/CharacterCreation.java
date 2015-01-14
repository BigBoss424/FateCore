/*
Review package management for the object classes. 
*/

//package objects;

import java.util.Scanner;

public class CharacterCreation
{
	public static void main(String [] args)
	{
		Scanner kb = new Scanner(System.in);
		//Create a character object
		
		int choice;
		
		System.out.println("Welcome to the Character Creation Application");
		System.out.println("For the Fate Core System.");
		
		displayMenu();
		
		do
		{

			if(choice == 1)
			{

			}
			else if(choice == 2)
			{

			}
			else if(choice == 3)
			{

			}
			else if(choice == 4)
			{

			}
		}while(choice != 5); //end do-while	
	}//end main

	//implement a menu system.
	public static void displayMenu()
	{
		System.out.println("Please select from the following choices:");
		System.out.println("1) Create a new character");
		System.out.println("2) Export Character Data to .txt");
		System.out.println("3) Import Character Data from .txt");
		System.out.println("4) Delete character");
		System.out.println("5) Quit");
	}//end displayMenu()

	//implement a character creation menu system
	public static void characterMenu()
	{
		System.out.println("Please select from the following choices:\n");
		System.out.println("1) Enter ID");
		System.out.println("2) Enter Aspects");
		System.out.println("3) Enter Will");
		System.out.println("4) Enter Skills");
		System.out.println("5) Enter Extras");
		System.out.println("6) Enter Physique");
		System.out.println("7) Enter Stunts");
		System.out.println("8) Enter Consequences");
		System.out.println("9) Print Character out");
		System.out.println("10) Return to main menu");
	}//end characterMenu
	
}//end CharacterCreation
