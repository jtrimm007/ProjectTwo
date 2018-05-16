/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Player.java
 */

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.JOptionPane;
/**
 * 
 * <b>This is the main driver that interacts with the user</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Player 
{
	// Global boolean variable to check the saveConformation() method
	static boolean createFileConfirmed = false;

	/**
	 * Description: This is a save confirmation method. 
	 * @throws inputExeption
	 */
	public static void saveConformation()throws inputExeption
	{
		//Boolean statement for the loop below
		boolean makeSure = true;

		// Make a new scanner for the save confirmation 
		Scanner makeSureInput = new Scanner(System.in);

		// Prompt the user with save or cancel option
		System.out.println("Are you sure you want to save this file? It will rewrite over any existing"
				+ " file with the same name and rewrite the text there in. 1: Save 2: Cancel");

		//collect the user input
		String saveOrCancelUserInput = makeSureInput.nextLine();

		int parseSaveOrCancel = Integer.parseInt(saveOrCancelUserInput);

		while(makeSure == true)
		{
			//validate user input
			if(parseSaveOrCancel >= 1 && parseSaveOrCancel <= 2)
			{
				// if user chose to save the file they pressed 1. Validation occurs here
				if(parseSaveOrCancel == 1)
				{
					try
					{
						// After we validate the user has chose to save the file set the global boolean variable createFileConfirmed to true. 
						//This will allow the system to run through the save/create process on line #85 in the createFile method
						createFileConfirmed = true;

						// Instantiate the createFile method
						createFile();

						// Set the makeSure loop to false so it will stop looping/running!
						makeSure = false;
					}
					catch(Exception error)
					{
						System.out.println("Something when wrong while trying to confirm the save!");
					}
					//makeSure = false;
				}
				else if(parseSaveOrCancel == 2)// if user chose #2 to cancel, return them to the main screen
				{
					//Instantiate the checkUserInputLoop to take user to the beginning 
					checkUserInputLoop();
				}
				else
				{
					throw new inputExeption("DO NOT USE CHARACTERS: You must enter a 1 to save or a 2 to cancel:");
				}

			}
			else
			{
				throw new inputExeption( "Must enter a 1 to save or a 2 to cancel:");
			}
			//close the console
			makeSureInput.close();
		}
	}
	/**
	 * 
	 * Method description: 
	 * Date: Mar 28, 2018
	 * @param hardware
	 * @return void
	 */
	public static void mapNodesStuff()
	{
		boolean done = false;
		Scanner cin = new Scanner(System.in);
		String response = "";
		int nodeID = 0;
		String pickUp = "";
		ScrewDriver name = null;
		//create three game nodes
		Node node1 = new Node(0, 0, 0, "Home", "Home is where the heart is.");
		Node node2 = new Node(1, 1, 1, "Library", "Books rock.");
		Node node3 = new Node(2, 2, 2, "SomePlace", "I'm lost....");
		
		/*
		 * North East 111
		 * North 011
		 * South West 000
		 * West 001
		 * East 100
		 */
		
ArrayList<Hardware> hardware = new ArrayList<Hardware>();
		
		//Create the hardware arrays
		ScrewDriver screwDriver1 = new ScrewDriver("Flathead", "Use this to open paint cans", 150, "Woodworking", true, 15, 10);
		
		 hardware.add(new ScrewDriver(screwDriver1));
		 
		 System.out.println(hardware);
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		ArrayList<Hardware> screwdriver = new ArrayList<Hardware>();
		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		
		//add connections between the nodes
		node1.addConnection(new Node(node2));
		node2.addConnection(new Node(node1));
		node2.addConnection(new Node(node3));

		
		//add player at first node and print node info
		Player1 player1 = new Player1(node1, name, 1000);
		
		System.out.print(player1);
		
		while(!done)
		{
			try
			{
				System.out.print("?: ");
				response = cin.nextLine();

				if(response.equals("D"))
				{
					done = true;
					continue;
				}
				nodeID = player1.getCurrentNode().isValidDirection(response.trim());
				if(nodeID == -1)
				{
					throw new BadGameMoveException(response, "Wrong direction goofball!");
				}
				player1.setCurrentNode(nodes.get(nodeID));

				System.out.print(player1);
				if(player1.getCurrentNode().equals(node3))
				{
					System.out.println(hardwareArray());
					System.out.println("Something Here! Press P to pick it up! Please don't type anything else!");
					pickUp = cin.nextLine();
					
					if(pickUp.equals("P"))
					{
						Player1 player1 = new Player1(node1, screwDirver, 1000);
						System.out.println(player1);
						if(pickUp.equals("Drop"))
						{
							Player1 player1 = new Player1(node1, name, 1000);
						}
					}
				}
			}
			catch(BadGameMoveException err)
			{
				System.out.println(err.getMessage());
			}
		}
		
		System.out.println("Bye Adventurer, see you next game!");
		cin.close();
	}
	public static ArrayList<Hardware> hardwareArray()
	{
		ArrayList<Hardware> hardware = new ArrayList<Hardware>();
		
		//Create the hardware arrays
		ScrewDriver screwDriver1 = new ScrewDriver("Flathead", "Use this to open paint cans", 150, "Woodworking", true, 15, 10);
		
		 hardware.add(new ScrewDriver(screwDriver1));
		
		 return hardware;
	}
	/**
	 * Description: This method creates and prints to a new file or just prints to the one that is there. 
	 * NOTE: THIS WILL SAVE OVER ANY INFORMATION THAT IS ALREADY THERE!
	 * @throws createNewFileError
	 */
	public static void createFile()throws createNewFileError
	{

		try
		{
			// if statement to check if the user has confirmed they want to save the file
			if(createFileConfirmed != true)
			{
				//Instantiate saveConformation
				saveConformation();
			}
			//create the arrayList for hardware and weapon

			ArrayList<Weapon> weapon = new ArrayList<Weapon>();

			
			//create the arrayList for Creature
			ArrayList<Creature>creature = new ArrayList<Creature>();
			
			//Setup new arrays for Hobgoblin
			/*
			* @param name
			 * @param health
			 * @param title
			 * @param loot **I don't know what to do with the loot hardware in the array.....
			 * @param attackValue
			 * @param isDead
			 * @param poisonous
			 */
			
			// I have errors in the array but I don't know how to fix them.... I know it has to do with Hardware wanting to convert to a string. 
			//Setup new arrays for Satyr

			
			//define array variables to put into array list
			//Create the hardware arrays
			//ScrewDriver screwDriver1 = new ScrewDriver("Flathead", "Use this to open paint cans", 150, "Woodworking", true, 15, 10);
			//ScrewDriver screwDriver2 = new ScrewDriver("Phillips", "Good for tightening screws", 175, "Woodworking", false, 0, 6);

			//Hammer hammer1 = new Hammer("Garden Hammer", "Good to use driving in tomato steaks", 200, "Garden", true, 20, 8);
			//Hammer hammer2 = new Hammer("Melon  Hammer", "great for smashing pumpkins and other melon like objects", 200, "Garden", true, 20, 8);
			
		//	Hobgoblin habgoblin = new Hobgoblin("blabla", 33.5, "Hobby",  screwDriver1, 5.5, false, true);
			
			//Satyr satyr = new Satyr("satbla", 34.5, "Satie", hammer1, 4.3, false, false);

			
			//Create the Weapon arrays
			//Gun gun1 = new Gun("M1 Garand", 600, 750, .30, 6);
			//Gun gun2 = new Gun("STG 44", 800, 900, 7.92, 30);
			
			//Knife knife1 = new Knife("KA-BAR", 400, 500, 11, 9);
			//Knife knife2 = new Knife("NR 43", 500, 600, 11, 10);


			//make a deep copy of the the array list so they can not be altered 
			
			
			
			
			//hardware.add(new ScrewDriver(screwDriver2));
			//hardware.add(new Hammer(hammer1));
			//hardware.add(new Hammer(hammer2));
			
			//weapon.add(new Gun(gun1));
			//weapon.add(new Gun(gun2));
			//weapon.add(new Knife(knife1));
			//weapon.add(new Knife(knife2));
			
		//	creature.add(new Hobgoblin(habgoblin));
		//	creature.add(new Satyr(satyr));

			
			//Create a new file to save to
			File file = new File("testFile.txt");

			//Print contents to the file
			PrintWriter output = new PrintWriter(file);

			//Loop through the array list for all the hardware
			for(Hardware tool : hardwareArray())
			{
				//Print out the array
				System.out.println(tool.toSave());
				output.println(tool.toSave());

				//break is needed or else the system throws  an exception because the one value travels all the way down the boolean logic
				//TESTING ONLY break;
			}
			
			//Loop through the array list for all the weapons
			//for(Weapon type : weapon)
			//{
				//Print out the array
			//	System.out.println(type.toSave());
			//	output.println(type.toSave());

				//break is needed or else the system throws  an exception because the one value travels all the way down the boolean logic
				//TESTING ONLY break;
		//	}
			//Loop throught the array list for the creatures
			//for(Creature animal : creature)
			//{
				//System.out.println(animal.toSave());
				//output.println(animal.toSave());
			//}
			//close the output so it writes to the file
			output.close();
		}
		catch(Exception error)
		{
			throw new createNewFileError(error + "Something went wrong creating the file at base level !");

		}
	}

	/**
	 * Description: Checks the user input and decides what to do. 1 will save the state of all objects in the ArrayList, 2 will Load the saved 
	 * contents into objects and into the ArrayList and 3 will end the program
	 * @param userInput
	 */
	public static void checkUserInput(int userInput)
	{

		if(userInput == 1) //Save the state of all object in the ArrayList
		{
			// Testing System.out.println("One works!");

			//Instantiate the creatFile method
			try
			{
				createFile(); //Instantiate the createFile() method
			}
			catch(Exception error)
			{
				System.out.println(error + "Something went wrong saving or creating the file!");
				checkUserInputLoop(); //Instantiate the checkUserInputLoop() method
			}	

		}
		else if(userInput == 2) //Load the saved contents into objects and into the ArrayList
		{
			//Instantiate the printFileContent() method
			printFileContent();
		}
		else // end
		{
			System.out.println("Hope to see you back soon!");
			System.exit(1);
		}
	}

	/**
	 * Description: On this method I did a little researching online to learn how to print out the content of a file. It uses the bufferedReader along with the 
	 * FileReader to load in the document and the the while loop has parameters that runs through each line. 
	 */
	public static void printFileContent()
	{
		//Try catch statement to initiate  reading a specific file.
		try(BufferedReader readFile = new BufferedReader(new FileReader("testFile.txt")))
		{
			String eachLine = null;

			//while loop to run through each line of the document and then print it out.
			while((eachLine = readFile.readLine()) != null)
			{
				System.out.println(eachLine); // print each line
			}
		}
		catch(Exception error)
		{
			System.out.println(error + "Something went wrong trying to load the file. Please try another option.");
		}
	}
	/**
	 * Description: Checks the user input to make sure the put a valid integer. 
	 * @param userInput
	 * @throws inputExeption
	 */
	public static void  wrongValueExeption(int userInput)throws inputExeption 
	{
		{
			//validate user input
			if(userInput >= 1 && userInput <= 3)
			{
				// Testing System.out.println("looking good!");

				//Instantiate the checkUserInput method
				checkUserInput(userInput);

			}
			else
			{
				//Throw a custom inputExeption
				throw new inputExeption("Please enter a 1, 2 or 3: ");
			}
		}
	}

	/**
	 * Description: This method is used to check the user input through a method
	 */
	public static void checkUserInputLoop()
	{
		//use boolean  for on or off for while loop
		boolean loop = true;
		while(loop == true)
		{
			try
			{
				//create a new scanner for userInput variable
				Scanner input = new Scanner(System.in);

				//Prompt the user
				System.out.println("Enter a 1) to save the state of all objects in the ArrayList, or 2) load the saved contents into objects and into the ArrayList, or 3) end: ");

				//Instantiate input scanner to load user input into a userInput variable
				String userInput = input.nextLine();

				//put the user input into a parse variable. I know this isn't a must, but it helps me to go step by step. 
				int parseUserInput = Integer.parseInt(userInput);

				//Instantiate wrongValueExeption method to check for correct selection from the user. 
				wrongValueExeption(parseUserInput);

				//close the scanner to prevent memory leaks.
				input.close();

				//Once everything has ran, set the loop boolean variable to false to break out of the loop. 
				loop = false;
			}
			catch(inputExeption error)// this exception will catch any integer that is not a 1, 2 or 3
			{
				System.out.println(error + "Enter 1, 2 or 3: ");
			}
			catch(NumberFormatException error)// this exception will catch everything else. 
			{
				System.out.println(error + "( DO NOT ENTER LETTERS!) Please use a number 1, 2 or 3: ");
			}
		}	
	}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args)
	{
		// Instantiate the checkuserInputLoop
		
		
		mapNodesStuff();
		
		//checkUserInputLoop();
		
		//System.out.println(hardwareArray());

	}
}
