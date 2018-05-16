/**
 * -------------------------------------------------
 * File name: Map.java
 * Project name: ProjectTwo
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Mar 28, 2018
 * -------------------------------------------------
 */

/**
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Mar 28, 2018
 * <hr>
 * @author Joshua Trimm
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Map
{
	//temporary driver ... remove after proof of concept 
	public static void main(String[] args)
	{
		boolean done = false;
		Scanner cin = new Scanner(System.in);
		String response = "";
		int nodeID = 0;
		
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
		
		ArrayList<Node> nodes = new ArrayList<Node>();
		nodes.add(node1);
		nodes.add(node2);
		nodes.add(node3);
		
		//add connections between the nodes
		node1.addConnection(new Node(node2));
		node2.addConnection(new Node(node1));
		node2.addConnection(new Node(node3));

		
		//add player at first node and print node info
		Player1 player1 = new Player1(node1, 1000);
		
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
				
			}
			catch(BadGameMoveException err)
			{
				System.out.println(err.getMessage());
			}
		}
		
		System.out.println("Bye Adventurer, see you next game!");
		cin.close();
	}
}