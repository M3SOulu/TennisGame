
public class TennisGame {
	//private int playerOneScore = 0;
	//private int playerTwoScore = 0;
	public void scored(Player player) {
		player.setScore();
	}
	
	public void showGameProgress(Player playerOne, Player playerTwo){
		if(playerOne.getScore() == 0 && playerTwo.getScore() == 0){
			System.out.println("0 - 0");
		}
		else if(playerOne.getScore() == 4 && playerTwo.getScore() < 4){
			System.out.println(playerOne.getName() + " wins!");	
		}
		else if(playerOne.getScore() < 4 && playerTwo.getScore() == 4){
			System.out.println(playerTwo.getName() + "wins!");
		}
		else if(playerOne.getScore() < 4 && playerTwo.getScore() < 4 && playerOne.getScore() != playerTwo.getScore()){
			String playerOneScoreName = scoreConverter(playerOne);
			String playerTwoScoreName = scoreConverter(playerTwo);
			System.out.println(playerOneScoreName + " - " + playerTwoScoreName);
		}
		else if(playerOne.getScore() == playerTwo.getScore()){
			System.out.println("Deuce!");
		}
		else if(playerOne.getScore() - playerTwo.getScore() == 1){
			System.out.println("advantage - 40");
		}
		else if(playerOne.getScore() - playerTwo.getScore() == -1){
			System.out.println("40 - advantage");
		}
		else if(playerOne.getScore() - playerTwo.getScore() == 2){
			System.out.println(playerOne.getName() +  " wins!");
		}
		else{
			System.out.println(playerTwo.getName() + " wins!");
		}
			
		
	}
	public String scoreConverter(Player player){
		String scoreName;
		switch(player.getScore())
		{
		case 1:
			scoreName = "15";
			break;
		case 2:
			scoreName = "30";
			break;
		case 3:
			scoreName = "40";
			break;
		default:
			scoreName = "Love";
		}
		return scoreName;
	}
}
