import java.util.Scanner;

public class TennisGame {
	static int player1score;
	static int player2score;
	
	public static String getScore(int score){
		switch(score){
			case 0:
				return "love";
			case 1:
				return "15";
			case 2:
				return "30";
			case 3:
				return "40";
			case 4:
				return "adv";
			default:
				return "WIN";
		}
	}
	
	public static void player1Scored(){
		if(player1score==3 && player2score<3) player1score = player1score + 2;
		else if(player1score==3 && player2score==3) player1score++;
		else if(player1score==3 && player2score==4) player2score = player2score - 1;
		else if(player1score==4) player1score++;
		else player1score++;
	}
	
	public static void player2Scored(){
		if(player2score==3 && player1score<3) player2score = player2score + 2;
		else if(player2score==3 && player1score==3) player2score++;
		else if(player2score==3 && player1score==4) player1score = player1score - 1;
		else if(player2score==4) player2score++;
		else player2score++;
	}
	
	public static void main(String[] args){
		int who = 0;
		Scanner in = new Scanner(System.in);
		
		while(player1score!=5 && player2score!=5){
			if(player1score==4 && player2score==4) System.out.println("deuce");
			else System.out.println(getScore(player1score) + "-" + getScore(player2score));
			who = in.nextInt();
			if (who==1) player1Scored();
			else player2Scored();
		}
		System.out.println(getScore(player1score) + "-" + getScore(player2score));
	}
}
