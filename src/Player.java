import exceptions.CantGetScoreDescriptionException;

public class Player {
	
	private int score;
	
	private static final String[] scoreDescription = {"love", "15", "30", "40"};
	
	public Player(){
		score = 0;
	}
	
	public void addPoint(){
		score++;
	}
	
	public int getScore(){return score;}
	
	public String getScoreDescription() throws CantGetScoreDescriptionException{
		if(score>3) throw new CantGetScoreDescriptionException();
		return scoreDescription[score];
	}

}
