/**
 * -------------------------------------------------
 * File name: Hobgoblin.java
 * Project name: ProjectTwo
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Mar 17, 2018
 * -------------------------------------------------
 */

/**
 * <b>Create a class for the creature Hobgoblin that extends Creatures and implements IEdible</b>
 * <hr>
 * Date created: Mar 17, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Hobgoblin  extends Creature implements IEdible {

	// Define variables
	Boolean poisonous;



	/**
	 * 
	 * Description: Overload Constructor
	 * @param name
	 * @param health
	 * @param title
	 * @param loot
	 * @param attackValue
	 * @param isDead
	 * @param poisonous
	 * Date: Mar 17, 2018
	 */
	public Hobgoblin(String name, Double health, String title, Hardware loot, Double attackValue, Boolean isDead, Boolean poisonous)
	{
		super(name, health, title, loot, attackValue, isDead);
		this.poisonous = poisonous;
	}

	/**
	 * Description: copy constructor 
	 * @param creature
	 * Date: Mar 17, 2018
	 */
	public Hobgoblin(Creature creature) {
		super(creature);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return Boolean
	 */
	public Boolean getPoisonous() {
		return poisonous;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param poisonous
	 * @return void
	 */
	public void setPoisonous(Boolean poisonous) {
		this.poisonous = poisonous;
	}

}
