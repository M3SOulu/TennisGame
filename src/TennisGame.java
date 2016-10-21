
public class TennisGame {

	private int player1score;
	private int player2score;
	private String score;

	public TennisGame() {
		player1score = 0;
		player2score = 0;
	}

	public String score(int player1score, int player2score) {
		if(player1score==1){
			player1score=15;
		}else if(player1score==2){
			player1score=30;
		}else if(player1score==3){
			player1score=40;
		}
		if(player2score==1){
			player2score=15;
		}else if(player2score==2){
			player2score=30;
		}else if(player2score==3){
			player2score=40;
		}
		
		if (player1score == 0 && player2score == 0) {
			score= "love - love";
		} else if (player1score != 0 && player2score == 0) {
			score= player1score + " - love";
		} else if (player1score == 0 && player2score != 0) {
			score= "love - " + player2score;
		} else if (player1score == 3 && player2score == 3) {
			score= "deuce";
		} else if (player1score == 4 && player2score == 3) {
			score= "adv - " + player2score;
		} else if (player1score == 3 && player2score == 4) {
			score= player1score + " - adv";
		}else if(player1score>3){
			if(player1score-player2score >2){
				score= "player1 wins";
			}else if(player1score-player2score==1){
				score= "adv - 40";
			}else if(player1score==player2score){
				score="deuce";
			}
			
		}else if(player2score>3){
			if(player2score-player1score >2){
				score= "player2 wins";
			}else if(player2score-player1score==1){
				score= "40 - adv";
			}else if(player1score==player2score){
				score="deuce";
			}
			
		}else {
			score= player1score + " - " + player2score;
		}
		return score;
	}
	public void player1scored(){
	      player1score++;
	}
	public void player2scored(){
		 player2score++;
	}
}
