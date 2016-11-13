/**
 * 
 * Tennis single Score
 *
 */
public class Score{
	private int score = 0;
	
	/**
	 * create a new Score
	 */
	public Score(){}

	/**
	 * 
	 * @return score
	 */
	public int getScore() {
		return score;
	}
	
	/**
	 * increment score of one point
	 */
	public void incrementScore() 
	{
		score++;
	}
	
	@Override
	public String toString()
	{
		String stringScore = "";
		
		if( score == 0 ){
			stringScore = "love";
		}
		else if( score == 1 ){
			stringScore = "15";
		}
		else if( score == 2 ){
			stringScore = "30";
		}
		else if( score == 3 ){
			stringScore = "40";
		}
		
		return stringScore;
	}

	
}
