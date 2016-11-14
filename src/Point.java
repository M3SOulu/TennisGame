/**
 * 
 * Tennis Point
 *
 */
public class Point {
	private Player player1;
	private Player player2;
	private int IdWinner;

	public Point(Player player1, Player player2) throws InvalidPlayerException {
		if (player1 == null || player2 == null) {
			throw new InvalidPlayerException();
		}

		this.player1 = player1;
		this.player2 = player2;

	}

	public int getWinner() {
		return IdWinner;
	}

	public Player getPlayer1() {
		return player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setWinner(Player p) throws InvalidPlayerException {
		if (!(p == player1) && !(p == player2)) {
			throw new InvalidPlayerException();
		} else {
			IdWinner = p.getId();
		}
	}

}
