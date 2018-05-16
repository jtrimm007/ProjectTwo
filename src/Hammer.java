/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Hammer.java
 */

/**
 * 
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joe Programmer
 */
public class Hammer extends Tool
{
	private double weight;
	
	
	/**
	 * 
	 * Description:
	 * @param name
	 * @param message
	 * @param points
	 * @param type
	 * @param isDangerous
	 * @param percentDangerous
	 * @param weight
	 * Date: Feb 19, 2018
	 */
	public Hammer(String name, String message, int points, String type, boolean isDangerous, int percentDangerous, double weight)
	{
		super(name, message, points, type, isDangerous, percentDangerous);
		this.weight = weight;
		setWeight(weight);
	}
	
	/**
	 * 
	 * Description:
	 * @param hammer
	 * Date: Feb 19, 2018
	 */
	public Hammer(Hammer hammer)
	{
		super(hammer);
		this.weight = hammer.getWeight();

	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @return
	 * @return double
	 */
	public double getWeight() {
		return weight;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @param weight
	 * @return void
	 */
	public void setWeight(double weight) {
		this.weight = weight;
	}
	/**
	 * Description: toStringt
	 * @return Hammer
	 */
	@Override
	public String toString() 
	{
		
		return super.toString() + " Hammer" + " [weight: " + weight + "]";
	}
}
