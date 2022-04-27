/**
 * Celebrity base class for the Celebrity game.
 * @author cody.henrichsen
 * @version 1.4 17/09/2018
 */
public class Celebrity
{
	/**
	 * The clue to determine the celebrity
	 */
	 private String celebClue;

	/**
	 * The answer or name of the celebrity.
	 */
	 private String celebName;

	 private String celebType;

	/**
	 * Creates a Celebrity instance with the supplied answer and clue
	 * @param answer
	 * @param clue
	 */
	public Celebrity(String answer, String clue, String type)
	{
		celebClue = clue;
		celebName = answer;
		celebType = type;
	}

	/**
	 * Supplies the clue for the celebrity
	 * @return
	 */
	public String getClue()
	{
		return celebClue;
	}

	/**
	 * Supplies the answer for the celebrity.
	 * @return
	 */
	public String getAnswer()
	{
		return celebName;
	}

	/**
	 * Updates the clue to the provided String.
	 * @param clue The new clue.
	 */
	public void setClue(String clue)
	{
		celebClue = clue;
	}

	/**
	 * Updates the answer to the provided String.
	 * @param answer The new answer.
	 */
	public void setAnswer(String answer)
	{
		celebName = answer;
	}

	/**
	 * Provides a String representation of the Celebrity.
	 */
	@Override
	public String toString()
	{
		return "The Celebrity is " + celebName + "!";
	}

}
