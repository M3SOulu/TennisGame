package lab;
public class TennisGame {
	private Player player1;
	private Player player2;
	private String gameResult;
	private String score1;
	private String score2;
	private int count1;
	private int count2;

	public TennisGame(String player1, String player2) {
		this.player1= new Player(player1);
		this.player2 = new Player(player2);
		this.score1 = "love";
		this.score2 = "love";
		this.count1 = 0;
		this.count2 = 0;
	}

	public String assignScore(String player) {
		this.gameResult = "";
		if (player.equalsIgnoreCase(this.player1.getPlayer())) {
			if (this.count1 == 0) {
				this.score1 = "15";
				this.count1++;
			}
			else if (this.count1 == 1) {
				this.score1 = "30";
				this.count1++;
			}
			else if (this.count1 == 2) {
				this.score1 = "40";
				this.count1++;
			}
			else if (this.count1 == 3){
				this.score1 = "Player1 win";
				this.count1++;
			}
			}

		 if (player.equals(this.player2.getPlayer())) {
			if (this.count2 == 0) {
				this.score2 = "15";
				this.count2++;
			}
			else if (this.count2 == 1) {
				this.score2 = "30";
				this.count2++;
			}
			else if (this.count2 == 2) {
				this.score2 = "40";
				this.count2++;
			}
			else if (this.count2 == 3){
				this.score2 = "Player2 win";
				this.count2++;
			}
			}
		 
		 if(this.count1 ==3){
			 this.gameResult = "Score: "+this.score1;
		 }
		 if(this.count2 ==3){
			 this.gameResult = "Score: "+this.score2;
		 }
		 this.gameResult = player + " scores > "+" Score: "+this.score1 + " - "+ this.score2;
		 return this.gameResult;
	}
	}



