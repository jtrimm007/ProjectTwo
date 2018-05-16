/**
 * Name: Joshua Trimm
 * Description: Java Project Three
 * Date: Feb 6, 2018
 * FileName: Knife.java
 */
 
 /**
 * 
 * <b>Creation of Knife object</b>
 * <hr>
 * Date created: Feb 19, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class Knife extends Weapon {
	
	private int length;
	private int sharpness;
	/**
	 * Description: overloaded constructor
	 * @param type
	 * @param attachPoint
	 * @param defendPoints
	 * @param length
	 * @param sharpness
	 */
	public Knife(String type, int attachPoint, int defendPoints, int length, int sharpness)
	{
		super(type, attachPoint, defendPoints);
		this.length = length;
		this.sharpness = sharpness;
	}
	/**
	 * Description: copy constructor
	 * @param knife
	 */
	public Knife(Knife knife)
	{
		super(knife);
		this.length = knife.getLength();
		this.sharpness = knife.getSharpness();
	}
	/**
	 * 
	 * @return length
	 */
	public int getLength() {
		return length;
	}
	/**
	 * 
	 * @param length
	 */
	public void setLength(int length) {
		this.length = length;
	}
	/**
	 * 
	 * @return sharpness
	 */
	public int getSharpness() {
		return sharpness;
	}
	/**
	 * 
	 * @param sharpness
	 */
	public void setSharpness(int sharpness) {
		this.sharpness = sharpness;
	}
	/**
	 * @return length sharpness
	 */
	@Override
	public String toString()
	{
		return super.toString() + " Knife [Length: " + length + " Sharpness " + sharpness + "]";
	}
	/**
	 * @return length sharpness
	 */
	public String toSave()
	{
		return super.toSave() + ":" + length + ":" + sharpness;
	}
}
