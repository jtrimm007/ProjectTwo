/**
 * 
 * <b>Abstract class for AbstractCreature</b>
 * <hr>
 * Date created: Mar 17, 2018
 * <hr>
 * @author Joshua Trimm
 */
public abstract class AbstractCreature {
	private String name;
	private Double health;
	private String title;
	private Hardware loot;
	private Double attackValue;
	/**
	 * 
	 * Description: Overloaded constructor
	 * @param name
	 * @param health
	 * @param title
	 * @param loot
	 * @param attackValue
	 * Date: Mar 17, 2018
	 */
	protected AbstractCreature(String name, Double health, String title, Hardware loot, Double attackValue)
	{
		super();
		this.name = name;
		this.health = health;
		this.title = title;
		this.loot = loot;
		this.attackValue = attackValue;

	}
	/**
	 * 
	 * Description: copy constructor
	 * @param abstractCreature
	 * Date: Mar 17, 2018
	 */
	protected AbstractCreature(AbstractCreature abstractCreature)
	{
		this.name = abstractCreature.getName();
		this.health = abstractCreature.getHealth();
		this.title = abstractCreature.getTitle();
		this.loot = abstractCreature.getLoot();
		this.attackValue = abstractCreature.getAttackValue();
	}
	/**
	 * 
	 * Method description:  getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return String
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Mar 17, 2018
	 * @param attackValue
	 * @return void
	 */
	public abstract  void takeDamage(double attackValue);

	/**
	 * 
	 * Method description: 
	 * Date: Mar 17, 2018
	 * @return
	 * @return boolean
	 */
	public abstract boolean checkDead();

	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param name
	 * @return void
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return Double
	 */
	public Double getHealth() {
		return health;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param health
	 * @return void
	 */
	public void setHealth(Double health) {
		this.health = health;
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return String
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param title
	 * @return void
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return Hardware
	 */
	public Hardware getLoot() {
		return loot;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param loot
	 * @return void
	 */
	public void setLoot(Hardware loot) {
		this.loot = loot;
	}
	/**
	 * 
	 * Method description: getter
	 * Date: Mar 17, 2018
	 * @return
	 * @return Double
	 */
	public Double getAttackValue() {
		return attackValue;
	}
	/**
	 * 
	 * Method description: setter
	 * Date: Mar 17, 2018
	 * @param attackValue
	 * @return void
	 */
	public void setAttackValue(Double attackValue) {
		this.attackValue = attackValue;
	}
/**
 * Description: toString method
 * @Override
 * @return string
 */
	@Override
	public String toString()
	{
		return "Name: " + name + " Health: " + health + " Title: " + title + " Loot: " + loot + " Attack Value: " + attackValue;
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
		return name + ":" + health +  ":" + title +  ":" + loot +  ":" + attackValue;
	}


}
