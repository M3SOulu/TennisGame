
public class TennisGame {
	
	public static class Player{
		
		int time;	//times of winning
		String score; //score of players
		
		public void minus(){
			time--;	//reduce times when meet deuce
		}
		
		public void getscore(){
			switch(time){
			case 0 : score = "love";
			case 1 : score = "15";
			case 2 : score = "30";
			case 3 : score = "40";
			case 4 : score = "adv";
			}
		}
	
		public void Score(Player player1,Player player2){
			if(player1.time == player2.time){
				if(player1.time > 2){
					System.out.println("deuce");
				}
				else if(player1.time == 4){
					System.out.println("deuce");
					player1.minus();
					player2.minus();
				}
				else
					System.out.println(player1.score+" - "+player2.score);
			}	
			else if(player1.time < 4 && player2.time <4){
				System.out.println(player1.score+" - "+player2.score);
				}
			else{
				if(player1.time-player2.time >= 2){
					System.out.println("player1 wins!");
				}
				else if(player2.time-player1.time >= 2){
					System.out.println("player2 wins!");
				}
				else{
					if(player1.time == 4 && player1.time-player2.time < 2 ){
						System.out.println("adv - "+player2.score);
					}
					else if(player2.time == 4 && player2.time-player1.time < 2 ){
						System.out.println(player1.score+" - adv");
					}
					else System.out.println(player1.score+" - "+player2.score);				
				}
			}
		}
	}
}
