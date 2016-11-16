
public class Main {

	public static void main(String[] args) {
		Player A = new Player("Filippo");
		Player B = new Player("Antonio");
		
		TennisGame match = new TennisGame(A, B);
		
		System.out.println(match.scorePlayerOne());
		System.out.println(match.scorePlayerTwo());
		System.out.println(match.scorePlayerTwo());
		System.out.println(match.scorePlayerTwo());
		System.out.println(match.scorePlayerOne());
		System.out.println(match.scorePlayerOne());
		System.out.println(match.scorePlayerOne());
		System.out.println(match.scorePlayerTwo());
		System.out.println(match.scorePlayerTwo());
		System.out.println(match.scorePlayerTwo());
	}

}
