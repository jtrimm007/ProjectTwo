

import java.util.Random;

/**
 * 
 * <b>Creature call the extends AbstractCreature and implements IEdible</b>
 * <hr>
 * Date created: Mar 17, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Creature extends AbstractCreature implements IEdible  {

	//define variables for Creature
	Boolean isDead;
	
	/**
	 * 
	 * Description: Overloaded constructor
	 * @param name
	 * @param health
	 * @param title
	 * @param loot
	 * @param attackValue
	 * @param isDead
	 * Date: Mar 17, 2018
	 */
	public Creature(String name, Double health, String title, Hardware loot, Double attackValue, Boolean isDead)
	{
		super(name, health, title, loot, attackValue);
		this.isDead = isDead;
	}
	/**
	 * 
	 * Description: copy constructor
	 * @param creature
	 * Date: Mar 17, 2018
	 */
	public Creature(Creature creature)
	{
		super(creature);
		this.isDead = creature.getIsDead();
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return Boolean
	 */
	public Boolean getIsDead() {
		return isDead;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param isDead
	 * @return void
	 */
	public void setIsDead(Boolean isDead) {
		this.isDead = isDead;
	}

	/**
	 * Description: toString method
	 * @Override
	 * @return string
	 */
	@Override
	public String toString()
	{
		return super.toString() + " Is Dead: " + isDead;
	}

	/**
	 * 
	 * Method description: toSave string
	 * Date: Mar 17, 2018
	 * @return
	 * @return String
	 */
	public String toSave()
	{
		return super.toSave() +  ":" + isDead;
	}
	/**
	 * Description: isPoisonous method
	 * @Override
	 * @return boolean
	 */
	@Override
	public boolean isPoisonous() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * Description: healthGain method
	 * @Override
	 * @return int
	 */
	@Override
	public int healthGain() {
		//Define a new random
		Random randomHealthGain = new Random() ;

		//Then define a veriable to put the positive or negative health gain into
		int randomCalcHealth = randomHealthGain.nextInt(25 + 1 + 25) - 25;

		//Then return the value of the calculated random health gain
		return randomCalcHealth;
	}

	/**
	 * Description: takeDamage method
	 * @Override
	 * @return void
	 * @param attackValue
	 */
	@Override
	public void takeDamage(double attackValue) {
		//NOTE: health -= attackValue

	}
	/**
	 * Description: checkDead method
	 * @Override
	 * @return boolean
	 * 
	 */
	@Override
	public boolean checkDead() {
		// if statement to check the statues 
		if(getHealth() <= 0)
		{
			return true;
		}
		return false;
	}


}
