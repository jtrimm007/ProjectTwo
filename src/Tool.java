/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Tool.java
 */

/**
 * 
 * <b>Creation of Tool object</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Tool extends Hardware
{

	private String type;
	private boolean isDangerous;
	private int percentDangerous;

	/**
	 * 
	 * Description:
	 * @param name
	 * @param message
	 * @param points
	 * @param type
	 * @param isDangerous
	 * @param percentDangerous
	 * Date: Feb 19, 2018
	 */
	public Tool(String name, String message, int points, String type, boolean isDangerous, int percentDangerous)
	{
		super(name, message, points);
		this.isDangerous = isDangerous;
		this.percentDangerous = percentDangerous;
		this.type = type;

	}

	// copy constructor
	public Tool(Tool tool)
	{
		super(tool);
		this.type = tool.getType();
		this.isDangerous = tool.isDangerous();
		this.percentDangerous = tool.getPercentDangerous();
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @return
	 * @return String
	 */
	public String getType() {
		return type;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @param type
	 * @return void
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @return
	 * @return boolean
	 */
	public boolean isDangerous() {
		return isDangerous;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @param isDangerous
	 * @return void
	 */
	public void setDangerous(boolean isDangerous) {
		this.isDangerous = isDangerous;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @return
	 * @return int
	 */
	public int getPercentDangerous() {
		return percentDangerous;
	}
	/**
	 * 
	 * Method description: 
	 * Date: Feb 19, 2018
	 * @param percentDangerous
	 * @return void
	 */
	public void setPercentDangerous(int percentDangerous) {
		this.percentDangerous = percentDangerous;
	}

	/**
	 * Description: toString
	 * @return tool
	 */
	@Override
	public String toString() 
	{

		return super.toString() + " Tool " + "[ Type: " + type + " Message: " + isDangerous + " Percent Dangerous: " + percentDangerous +  "]"; 
	}

	/*
	 * (non-Javadoc)
	 * @see Hardware#toSave()
	 */
	public String toSave()
	{
		return super.toSave() + ":" + type + ":" + isDangerous + ":" + percentDangerous;
	}

}
