
public class TennisGame {

	private Player player1;
	private Player player2;
	
	TennisGame(String name1, String name2){
		player1 = new Player(name1);
		player2 = new Player(name2);
	}
	
	public String getScore() {
        if (player1.getScore() >= 3 && player2.getScore() >= 3) {
            if (Math.abs(player2.getScore() - player1.getScore()) >= 2) {
                return getLeadPlayer().getName() + " won";
            } else if (player1.getScore() == player2.getScore()) {
                return "deuce";
            } else {
            	if(getLeadPlayer().equals(player1)){
            		return "advantage - 40";
            	}
            	else{
            		return "40 - advantage";
            	}
            }
        } else {
            return player1.getScoreDescription() + ", " + player2.getScoreDescription();
        }
    }
	
	public Player getLeadPlayer() {
        return (player1.getScore() > player2.getScore()) ? player1 : player2;
    }

}


