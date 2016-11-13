package lab;

public class Sas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Arrange
				String player1 = "player1";
				String player2 = "player2";
				TennisGame game1 = new TennisGame(player1, player2);
				//Act
				String ris = game1.assignScore(player1);
				ris = game1.assignScore(player1);
				ris = game1.assignScore(player2);
				ris = game1.assignScore(player1);
				ris = game1.assignScore(player1);
				
				System.out.println(ris);

	}

}
