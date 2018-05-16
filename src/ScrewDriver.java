/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: ScrewDriver.java
 */

/**
 * 
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class ScrewDriver extends Tool
{
	private double length;

	/**
	 * 
	 * Description:
	 * @param name
	 * @param message
	 * @param points
	 * @param type
	 * @param isDangerous
	 * @param percentDangerous
	 * @param length
	 * Date: Feb 19, 2018
	 */
	public ScrewDriver(String name, String message, int points, String type, boolean isDangerous, int percentDangerous, double length)
	{
		super(name, message, points, type, isDangerous, percentDangerous);
		this.length = length;
		setLength(length);
	}

	/**
	 * 
	 * Description:
	 * @param screwdriver
	 * Date: Feb 19, 2018
	 */
	public ScrewDriver(ScrewDriver screwdriver)
	{
		super(screwdriver);
		this.length = screwdriver.getLength();

	}



	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @return
	 * @return double
	 */
	public double getLength() {
		return length;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @param length
	 * @return void
	 */
	public void setLength(double length) {
		this.length = length;
	}

	/**
	 * Description: toStringt
	 * @return tool
	 */
	@Override
	public String toString() 
	{
		return super.toString() + " ScrewDriver" + " [ Length: " + length + "]";
	}
	
	/**
	 * 
	 */
	public String toSave()
	{
		return super.toSave() + ":" + length;
	}
}
