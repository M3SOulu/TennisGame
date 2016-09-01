package fi.oulu.tol.sqat.tennisGame;

import java.util.HashMap;
import java.util.Map;

public class TennisGame {
	
	private Map<Integer, Score> scores;
	
	
	public TennisGame(int player1, int player2){
		this.scores = new HashMap<Integer, Score>();
		this.scores.put(player1, new Score());
		this.scores.put(player2, new Score());
	}
	public void ScorePoint(int player){
		Score pScore = this.scores.get(player);
		pScore.AddScore();
	}
	public void DecreseScore(int player){
		Score pScore = this.scores.get(player);
		pScore.DecreaseScore();
	}
	public void PrintScore(int player1, int player2){
		Score p1 = this.scores.get(player1);
		Score p2 = this.scores.get(player2);
		
		if (p1.GetNumScore() == Score.FOURTY && p2.GetNumScore() == Score.FOURTY){
			System.out.println("Deuce");
		}
		else if (p1.GetNumScore() == Score.ADVANTAGE){
			System.out.println("Adtantage P1");
		}
		else if (p2.GetNumScore() == Score.ADVANTAGE){
			System.out.println("Adtantage P2");
		}
		else {
			System.out.println(p1.GetScore() +" - " + p2.GetScore());
		}
	}

}

