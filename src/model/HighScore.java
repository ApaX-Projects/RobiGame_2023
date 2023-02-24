package model;

/**
 * Klasse zur Verwaltung von HighScore-Daten
 * @author seyaw
 *
 */

public class HighScore
{
	String name;
	int score;
	
	/**
	 * 
	 * @param name Übergibt den Namen
	 * @param score Übergibt den Score
	 */
	
	public HighScore(String name, int score)
	{
		this.name = name;
		this.score = score;
	}

	

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}
	
}
