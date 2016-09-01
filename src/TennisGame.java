import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TennisGame {

	private static int player1Score = 0; //"love", "fifteen", "thirty", and "forty"(0,1,2,3)
	private static int player2Score = 0; //"love", "fifteen", "thirty", and "forty"(0,1,2,3)
	private static int playResult = 0;
	
	private static void getScore() throws IOException {

		BufferedReader br = null;
		
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Select players number: ");
		String input = br.readLine();

		if (input.equals("1")) {
			player1Score += 1;
		} else if (input.equals("2")) {
			player2Score += 1;
		}

	}

	public static void CalculateResult() {
		if (player1Score > 3 & player2Score < 3) {
			playResult = 1;
		} else if (player2Score > 3 & player1Score < 3) {
			playResult = 2;
		} else if (player1Score == 4 & player2Score == 3) {
			playResult = 4;
		} else if (player2Score == 4 & player1Score == 3) {
			playResult = 5;
		} else if (player2Score == 4 & player1Score == 4) {
			playResult = 3;
			player2Score -= 1;
			player1Score -= 1;
		} else if (player2Score == 3 & player1Score == 3) {
			playResult = 3;
		} else if (player1Score > 4 & player2Score == 3) {
			playResult = 1;
		} else if (player2Score > 4 & player1Score == 3) {
			playResult = 2;
		} else
			playResult = 0;
	}

	public static void main(String[] args) throws IOException {
		int i = 0;
		while (i < 1) {
			getScore();
			CalculateResult();

			switch (playResult) {
			case 0:
				System.out.println(player1Score + "-" + player2Score);
				break;
			case 1:
				System.out.println("Player 1 wins");
				System.exit(0);
				break;
			case 2:
				System.out.println("Player 2 wins");
				System.exit(0);
			case 3:
				System.out.println("Deuce");
				break;
			case 4:
				System.out.println("Advantage Player1");
				break;
			case 5:
				System.out.println("Advantage Player2");
				break;
			}
		}
	}

}
