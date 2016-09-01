package fi.oulu.tol.sqat.tennisGame;

public class Score {
	
	private String[] scoreText = {"love", "fifteen", "thirty", "fourty", "advantage"};
	public static int LOVE = 0;
	public static int FIFTEEN = 2;
	public static int THIRTY = 2;
	public static int FOURTY = 3;
	public static int ADVANTAGE = 4;
	private int score = 0;
	
	
	public void AddScore(){
		this.score++;
	}
	public void DecreaseScore(){
		this.score--;
	}
	public String GetScore(){
		return this.scoreText[this.score];
	}
	public int GetNumScore(){
		return this.score;
	}
}
