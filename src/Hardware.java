/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Hardware.java
 */
public class Hardware {


	private String name;
	private String message;
	private int points;

	/**
	 * 
	 * Description: Overloaded constructor
	 * @param name
	 * @param message
	 * @param points
	 * Date: Feb 19, 2018
	 */
	public Hardware(String name, String message, int points)
	{

		this.name = name;
		this.message = message;
		this.points = points;

	}

	/**
	 * 
	 * Description: Copy Constructor
	 * @param hardware
	 * Date: Feb 19, 2018
	 */
	public Hardware(Hardware hardware)
	{

		this.name = hardware.getName();
		this.message = hardware.getMessage();
		this.points = hardware.getPoints();
	}
	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @return message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * 
	 * @param message
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * 
	 * @return points
	 */
	public int getPoints() {
		return points;
	}
	/**
	 * 
	 * @param points
	 */
	public void setPoints(int points) {
		this.points = points;
	}

	/**
	 * Description: toString
	 * @param hardware
	 */
	@Override
	public String toString() 
	{

		return "Hardware "  +  "[Name: " + name + " Message: " + message + " Points: " + points + "]";
	}

	/**
	 * Description: toSave method
	 * @return
	 */
	public String toSave()
	{
		return name + ":" + message +  ":" + points;
	}
}
