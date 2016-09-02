

public class TennisGame {
	
	final int FORTY = 3;
	
	private String[] scores;
	private boolean advantage, game;
	private int player1, player2;
	
	
	public TennisGame(){
		scores = new String[] {"love", "15", "30", "40", "advantage"};
		advantage = false;
		game = false;
		player1 = 0;
		player2 = 0;
	}
	//return game score
	public String getScore(){
		if(game == true){
			String winner = null;
			if(player1 > player2){
				winner = "Player 1 wins";
			}
			else{
				winner = "Player 2 wins";
			}
			return winner;
		}
		String score1 = scores[player1];
		String score2 = scores[player2];
		if(player1 == FORTY && player2 == FORTY){
			return "deuce";
		}
		
		return "Score: "+score1+ " - " +score2;
	}
	//add player1 score
	public void player1Scored(){
		if(advantage){
			if(player2 > player1){
				player2--;
			}
		}
		else{
			player1++;
		}
		updateGame();
		
	}
	//add player2 score
	public void player2Scored(){
		if(advantage){
			if(player1 > player2){
				player1--;
			}
		}
		else{
			player2++;
		}
		updateGame();

		
	}
	//method to check the situation
	private void updateGame(){
		int winning = Math.max(player1, player2);
		//if the player with the higher score is at forty
		if(winning > FORTY){
			if(Math.min(player1, player2) == FORTY){
				//if the score is "deuce" change set advantage into use
				advantage = true;
				if(winning - Math.min(player1, player2) == 2){
					advantage = false;
				}
			}
			if(!advantage){
				game = true;
			}
		}
	}
	
	
}
