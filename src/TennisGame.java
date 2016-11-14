
public class TennisGame {
	
	public String convertScores(int score) throws InvalidScoreException {
		String result = "";
		
		if(score == 0) {
			result = "love";
		} else if(score == 1) {
			result = "15";
		} else if(score == 2) {
			result = "30";
		} else if(score == 3) {
			result = "40";
		} else if(score > 3){
			result = "advantage";
		} else {
			throw new InvalidScoreException();
		}
		
		return result;
	}
	
}
