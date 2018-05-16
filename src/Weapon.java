/**
 * Description: Java Project Three
 * @author Joshua Trimm
 * File: Weapon.java
 */
public class Weapon {
	
	private String type;
	private int attachPoint;
	private int defendPoints;
	
	/**
	 * Description: overloaded constructor 
	 * @param type
	 * @param attachPoint
	 * @param defendPoints
	 */
	public Weapon(String type, int attachPoint, int defendPoints)
	{
		this.type = type;
		this.attachPoint = attachPoint;
		this.defendPoints = defendPoints;
	}
	/**
	 * Description: copy constructor
	 * @param weapon
	 */
	public Weapon(Weapon weapon)
	{
		this.type = weapon.getType();
		this.attachPoint = weapon.getAttachPoint();
		this.defendPoints = weapon.getDefendPoints();
	}
	/**
	 * 
	 * @return type
	 */
	public String getType() {
		return type;
	}
	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 
	 * @return attachPoint
	 */
	public int getAttachPoint() {
		return attachPoint;
	}
	/**
	 * 
	 * @param attachPoint
	 */
	public void setAttachPoint(int attachPoint) {
		this.attachPoint = attachPoint;
	}
	/**
	 * 
	 * @return defendPoints
	 */
	public int getDefendPoints() {
		return defendPoints;
	}
	/**
	 * 
	 * @param defendPoints
	 */
	public void setDefendPoints(int defendPoints) {
		this.defendPoints = defendPoints;
	}
	/**
	 * Description: toString
	 * @param Weapon
	 * @return type, attachPoint and defendPoints
	 */
	@Override
	public String toString()
	{
		return "Weapon [Type: " + type + "Attach Points: " + attachPoint + "Defend Points " + defendPoints;
	}
	/**
	 * Description: toSave()
	 * @return type, attachPoint and defendPoints
	 */
	public String toSave()
	{
		return type + ":" + Integer.toString(attachPoint) + ":" + Integer.toString(defendPoints);
	}

}
