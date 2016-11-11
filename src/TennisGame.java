
public class TennisGame {

	private Player playerOne;
	private Player playerTwo;

	public TennisGame(Player playerA, Player playerB) {
		this.playerOne = playerA;
		this.playerTwo = playerB;
	}

	public String scorePlayerOne() {
		String result = null;

		if (playerOne.getPoint() == 0) {
			playerOne.setPoint(15);
			if (playerTwo.getPoint() == 0) {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - love";
			} else {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - "
						+ playerTwo.getPoint();
			}
		} else if (playerOne.getPoint() == 15) {
			playerOne.setPoint(15);
			if (playerTwo.getPoint() == 0) {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - love";
			} else {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - "
						+ playerTwo.getPoint();
			}
		} else if (playerOne.getPoint() == 30) {
			playerOne.setPoint(10);
			if (playerTwo.getPoint() == 0) {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - love";
			} else if (playerTwo.getPoint() == 40) {
				result = playerOne.getName() + " scores > Score: deuce";
			} else {
				result = playerOne.getName() + " scores > Score: " + playerOne.getPoint() + " - "
						+ playerTwo.getPoint();
			}
		} else if (playerOne.getPoint() == 40) {
			if (playerTwo.getPoint() < 40) {
				result = playerOne.getName() + " scores > Score: " + playerOne.getName() + " wins";
			} else if (playerTwo.getPoint() == 40 && playerTwo.isAdvantage() == false && playerOne.isAdvantage() == false) {
				playerOne.setAdvantage(true);
				result = playerOne.getName() + " scores > Score: advantage - " + playerTwo.getPoint();
			} else if (playerTwo.getPoint() == 40 && playerTwo.isAdvantage() == false && playerOne.isAdvantage() == true){
				result = playerOne.getName() + " scores > Score: " + playerOne.getName() + " wins";
			} else if (playerTwo.getPoint() == 40 && playerTwo.isAdvantage() == true) {
				playerTwo.setAdvantage(false);
				result = playerOne.getName() + " scores > Score: deuce";
			} else if (playerOne.isAdvantage() == true) {
				result = playerOne.getName() + " scores > Score: " + playerOne.getName() + " wins";
			}
		}

		return result;
	}

	public String scorePlayerTwo() {
		String result = null;
		
		if (playerTwo.getPoint() == 0) {
			playerTwo.setPoint(15);
			if (playerOne.getPoint() == 0){
				result = playerTwo.getName() + " scores > Score: love - " + playerTwo.getPoint();
			} else {
				result = playerTwo.getName() + " scores > Score: " + playerOne.getPoint() + " - " + playerTwo.getPoint();
			}
		} else if (playerTwo.getPoint() == 15) {
			playerTwo.setPoint(15);
			if (playerOne.getPoint() == 0){
				result = playerTwo.getName() + " scores > Score: love - " + playerTwo.getPoint();
			} else {
				result = playerTwo.getName() + " scores > Score: " + playerOne.getPoint() + " - " + playerTwo.getPoint();
			}
		} else if (playerTwo.getPoint() == 30) {
			playerTwo.setPoint(10);
			if (playerOne.getPoint() == 0){
				result = playerTwo.getName() + " scores > Score: love - " + playerTwo.getPoint();
			} else if (playerOne.getPoint() == 40) {
				result = playerTwo.getName() + " scores > Score: deuce";
			} else {
				result = playerTwo.getName() + " scores > Score: " + playerOne.getPoint() + " - " + playerTwo.getPoint();
			}
		} else if (playerTwo.getPoint() == 40){
			if (playerOne.getPoint() < 40) {
				result = playerTwo.getName() + " scores > Score: " + playerTwo.getName() + " wins";
			} else if (playerOne.getPoint() == 40 && playerOne.isAdvantage() == false && playerTwo.isAdvantage() == false) {
				playerTwo.setAdvantage(true);
				result = playerTwo.getName() + " scores > Score: " + playerOne.getPoint() + " - advantage";
			} else if (playerOne.getPoint() == 40 && playerOne.isAdvantage() == false && playerTwo.isAdvantage() == true){
				result = playerTwo.getName() + " scores > Score: " + playerTwo.getName() + " wins";
			} else if (playerOne.getPoint() == 40 && playerOne.isAdvantage() == true) {
				playerOne.setAdvantage(false);
				result = playerTwo.getName() + " scores > Score: deuce";
			} else if (playerTwo.isAdvantage() == true){
				result = playerTwo.getName() + " scores > Score: " + playerTwo.getName() + " wins";
			}
		}
		
		return result;
	}
}
