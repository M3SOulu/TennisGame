import java.util.Scanner;

public class TennisGame {
	static class Player{
		// attributes
		public int score;// the times a player scores

		// constructors
		public Player(){ score = 0 ;}// initialize the score
		public Player(int s){ score=s; }// initialize the score 
		
		// functions
		public void set_score(){ score++; }// the player scores
		public void return_score(){ score--;}
		public String score_switch()// to switch score into the real scores
		{
			String result = "";
			switch(score)
			{
			case 0:result ="love";break;
			case 1:result ="15";break;
			case 2:result ="30";break;
			case 3:result ="40";break;
			case 4:result ="adv";break;
			}
			return result;
		}
	}
	
	// other functions
	public static boolean Compare(Player p1, Player p2,boolean check)
	{
		if( p1.score==p2.score && p1.score>2 )
		{
			System.out.println("Deuce");
			if(p1.score==4)
			{	
				p1.return_score();
				p2.return_score();
			}
		}
		else if(p1.score<4 && p2.score<4 )
			System.out.println(p1.score_switch()+"-"+p2.score_switch());
		else
		{
			if( p1.score-p2.score>=2 )
			{
				System.out.println("Player1 wins!");
				check = false;
			}
			else if( p2.score-p1.score>=2 )
			{
				System.out.println("Player2 wins!");
				check = false;
			}
			else
				System.out.println(p1.score_switch()+"-"+p2.score_switch());
		}
		return check;
	}
	
	public static void Get_result(Player p1, Player p2)

	{
		boolean check=true;
		int s;
		while(check)
		{
			System.out.print("Input ´1´, player1 scores; Input ´2´, player2 scores: ");
			Scanner scanner = new Scanner(System.in);
			s = scanner.nextInt();
			if(s==1)
				p1.set_score();
			else
				p2.set_score();
			check = Compare(p1,p2,check);
		}
	}
	public static void main(String[] args)
	{
		Player p1 = new Player();
		Player p2 = new Player();
		Get_result(p1,p2);
	}
}
