import java.util.Random;

public class TennisGame {

	
	public int playerOneScore = 0;
	public int playerTwoScore = 0;
	public String pOneScore = "love";
	public String pTwoScore = "love";
	public Random rn;
	public int maxMin;
	public int randomNumber;
	
	public static void main(String [ ] args)
	{
		TennisGame gm = new TennisGame();
		
		for(int i=1; i<20; i++){
		gm.SetPoint();
		gm.SetScoreForPlayerOne();
		gm.SetScoreForPlayerTwo();
		gm.CheckForWin();
		gm.getScore();
		}
	}
	
	
	public void getScore(){
		
		System.out.println(pOneScore + " - " + pTwoScore);
		
	}
	
	
	public void SetScoreForPlayerOne(){
		
		if (playerOneScore == 0){
			pOneScore = "love";
		} else if (playerOneScore == 1){
			pOneScore = "15";
		} else if (playerOneScore == 2){
			pOneScore = "30";
		} else if (playerOneScore == 3){
			pOneScore = "40";
		}
	}
	
	public void SetScoreForPlayerTwo(){
		
		if (playerTwoScore == 0){
			pTwoScore = "love";
		} else if (playerTwoScore == 1){
			pTwoScore = "15";
		} else if (playerTwoScore == 2){
			pTwoScore = "30";
		} else if (playerTwoScore == 3){
			pTwoScore = "40";
		}	
	}
	
	public void CheckForWin(){
		
		if(playerOneScore == 4 && playerTwoScore < 2){
			System.out.println("Player 1 wins!");
			System.exit(0);
		}else if (playerTwoScore == 4 && playerOneScore < 2){
			System.out.println("Player 2 wins!");
			System.exit(0);
		}
		
	}
	
	public void SetPoint(){
		
		rn = new Random();
		maxMin = 1 - 0 + 1;
		randomNumber =  rn.nextInt(maxMin) + 0;
		
		if(randomNumber == 0){
			playerOneScore++;
		}else if (randomNumber == 1){
			playerTwoScore++;
		}
	}
	
}  
