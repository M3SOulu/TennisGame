

public class TennisGame {

	final String LOVE = "love", FIFTEEN = "15", THIRTY = "30", FORTY = "40", ADVANTAGE = "Advantage";
	private boolean advantage, game;
	private int player1, player2;
	
	
	public TennisGame(){
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
		String score1 = getName(player1);
		String score2 = getName(player2);
		if(player1 == 3 && player2 == 3){
			return "deuce";
		}
		
		return "Score: "+score1+ " - " +score2;
	}
	//add player1 score
	public void player1Scored(){
		if(advantage){
			if(player2 > player1){
				player2--;
				advantage = false;
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
				advantage = false;
			}
		}
		else{
			player2++;
		}
		updateGame();

		
	}
	private String getName(int n){
		switch(n){
			case 0: return LOVE;
			case 1: return FIFTEEN;
			case 2: return THIRTY;
			case 3: return FORTY;
			case 4: return ADVANTAGE;
			default: break;
		}
		return null;
	}
	//method to check the situation
	private void updateGame(){
		int winning = Math.max(player1, player2);
		//if the player with the higher score is at forty
		int forty = 3;
		if(winning > forty){
			if(Math.min(player1, player2) == forty){
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
