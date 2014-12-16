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
}//end CharacterCreation
