/**
 * -------------------------------------------------
 * File name: Satyr.java
 * Project name: ProjectTwo
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Mar 17, 2018
 * -------------------------------------------------
 */

/**
 * <b>Satyr class extends Creature and implements IEdible</b>
 * <hr>
 * Date created: Mar 17, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Satyr extends Creature implements IEdible {

	//define variables
	Boolean poisonous;
	
	/**
	 * 
	 * Description: Overloaded constructor
	 * @param name
	 * @param health
	 * @param title
	 * @param loot
	 * @param attackValue
	 * @param isDead
	 * @param poisonous
	 * Date: Mar 17, 2018
	 */
	public Satyr(String name, Double health, String title, Hardware loot, Double attackValue, Boolean isDead, Boolean poisonous)
	{
		super(name, health, title, loot, attackValue, isDead);
		this.poisonous = poisonous;
	}
	/**
	 * Description: Copy Constructor 
	 * @param creature
	 * Date: Mar 17, 2018
	 */
	public Satyr(Creature creature) {
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
