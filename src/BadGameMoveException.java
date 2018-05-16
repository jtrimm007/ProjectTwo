/**
 * -------------------------------------------------
 * File name: BadGameMoveException.java
 * Project name: ProjectTwo
 * -------------------------------------------------
 * Creator's name: Joshua Trimm
 * Email: joshua@trimwebdesign.com
 * Course and section: CISP 1020 A01
 * Creation date: Mar 28, 2018
 * -------------------------------------------------
 */

/**
 * <b>[Enter purpose here]</b>
 * <hr>
 * Date created: Mar 28, 2018
 * <hr>
 * @author Joshua Trimm
 */
public class BadGameMoveException extends Exception
{
	private String badMove;
	
	public BadGameMoveException(String msg)
	{
		super(msg);
	}
	
	public BadGameMoveException(String badMove, String msg)
	{
		super(msg);
		this.badMove = badMove;
	}
	
	public String badMove()
	{
		return badMove;
	}
	
}