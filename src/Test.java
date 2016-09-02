
public class Test {
	
	public static void main(String[] args) {
		TennisGame tg;
		
		tg = new TennisGame();
		tg.playerScored(1);
		tg.playerScored(2);
		tg.playerScored(1);
		tg.playerScored(1);
		tg.playerScored(1);
		System.out.println(tg.getScore());
		
		tg = new TennisGame();
		tg.playerScored(1);
		tg.playerScored(2);
		tg.playerScored(1);
		tg.playerScored(1);
		tg.playerScored(2);
		tg.playerScored(2);
		System.out.println(tg.getScore());
	}

}
