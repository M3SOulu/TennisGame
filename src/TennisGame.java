import exceptions.CantGetScoreDescriptionException;
import exceptions.GameAlreadyFinishedException;

public class TennisGame {

	private Player player1;
	private Player player2;
	private String gameScore;
	private final String winningBallFormat = " scores"; 
	private final String initialScoreFormat = "Initial ";
	private final String showScoreFormat = " > Score: ";
	
	public TennisGame(String player1Name, String player2Name) throws CantGetScoreDescriptionException {
		this.player1 = new Player(player1Name);
		this.player2 = new Player(player2Name);
		this.gameScore = player1.getScoreDescription() + " - " + player2.getScoreDescription();
	}

	public void setGameScore() throws CantGetScoreDescriptionException {

		//Victory1
		if (player1.getScore() > 3 && player1.getScore() - player2.getScore() >= 2)
			gameScore = player1.getName() + " wins";
		//Victory2
		else if (player2.getScore() > 3 && player2.getScore() - player1.getScore() >= 2)
			gameScore = player2.getName() + " wins";
		//Both scores >=3
		else if (player1.getScore() >= 3 && player2.getScore() >= 3) {
			//Odd
			if (player1.getScore() == player2.getScore())
				gameScore = "deuce";
			//Advantage1
			else if (player1.getScore() - player2.getScore() == 1)
				gameScore = "advantage - " + player2.getScoreDescription();
			//Advantage2
			else if (player1.getScore() - player2.getScore() == -1)
				gameScore = player2.getScoreDescription() + " - advantage";
		}
		//Both scores <3
		else
			gameScore = player1.getScoreDescription() + " - " + player2.getScoreDescription();
	}
	
	public String winningBallBy(String playerName) throws CantGetScoreDescriptionException, GameAlreadyFinishedException{
		
		if(gameScore.contains("wins")) throw new GameAlreadyFinishedException();
		
		if( playerName.equals(player1.getName()) ){
			player1.addPoint();
			setGameScore();
			return player1.getName() + winningBallFormat;
		}else{
			player2.addPoint();
			setGameScore();
			return player2.getName() + winningBallFormat;
		}
	}
	
	public String showGameScore(){
		if(player1.getScore() == 0 && player2.getScore() == 0) 
			return initialScoreFormat + gameScore;
		else 
			return showScoreFormat + gameScore;
	}
	
	public String getGameScore(){
		return gameScore;
	}

}
