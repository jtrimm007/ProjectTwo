/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Gun.java
 */
 
 /**
 * 
 * <b>Creation of Gun object</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Gun extends Weapon {
	
	private double caliber; // Project specs says to create this as an int. However, calibers are not measured in "whole numbers"
	private int numberOfBullets;
	/**
	 * Description: Overloaded constructor pulling from the Weapon class
	 * @param type
	 * @param attachPoint
	 * @param defendPoints
	 * @param caliber
	 * @param numberOfBullets
	 */
	public Gun(String type, int attachPoint, int defendPoints, double caliber, int numberOfBullets)
	{
		super(type, attachPoint, defendPoints);
		this.caliber = caliber;
		this.numberOfBullets = numberOfBullets;
	}
	/**
	 * Description: Copy constructor with a super pulling from the weapon class
	 * @param gun
	 */
	public Gun(Gun gun)
	{
		super(gun);
		this.caliber = gun.getCaliber();
		this.numberOfBullets = gun.getNumberOfBullets();
	}
/**
 * 
 * @return caliber
 */
	public double getCaliber() {
		return caliber;
	}
/**
 * 
 * @param caliber
 */
	public void setCaliber(double caliber) {
		this.caliber = caliber;
	}
	/**
	 * 
	 * @return numberOfBullets
	 */
	public int getNumberOfBullets() {
		return numberOfBullets;
	}
	/**
	 * 
	 * @param numberOfBullets
	 */
	public void setNumberOfBullets(int numberOfBullets) {
		this.numberOfBullets = numberOfBullets;
	}
	/**
	 * Description: toString pulling from the Weapon class
	 */
	@Override
	public String toString()
	{
		return super.toString() + "Gun [Caliber: " + caliber + " Number Of Bullets: " + numberOfBullets + "]";
	}
	/**
	 * Description: toSave with super pulling from the Weapon class
	 */
	public String toSave()
	{
		return super.toSave() + ":" + caliber + ":" + numberOfBullets;
	}

}
