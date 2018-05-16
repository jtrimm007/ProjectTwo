import java.util.ArrayList;

/**
 * -------------------------------------------------
 * File name: Player1.java
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
public class Player1 extends ScrewDriver
{
	private Node currentNode;
	private double health;
	
	public Player1(Node currentNode, ScrewDriver name,  double health)
	{
		super(name);
		this.currentNode = currentNode;
		this.health = health;
	}

	public Node getCurrentNode()
	{
		return currentNode;
	}
	
	private void setHealth(double health)
	{
		this.health = health;
	}
	
	public double getHealth()
	{
		return health;
	}
	
	public void takeDamage(double damage)
	{
		double damageTaken = health - damage;
		setHealth(damageTaken);
	}
	
	public void addHealth(double heal)
	{
		double healthAdded = health + heal;
		if(health > 1000)
		{
			setHealth(1000);
		}
		else
		{
			setHealth(healthAdded);
		}
	}
	
	public boolean checkDead()
	{
		if(health <= 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public void setCurrentNode(Node currentNode)
	{
		this.currentNode = currentNode;
	}
	
	@Override
	public String toString() {
		return "\nPlayer [currentNode=" + currentNode + "\nPlayer hardware=" + getName() + "\nPlayer health=" + health + "]";
	}
}