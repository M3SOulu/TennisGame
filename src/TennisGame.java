public class TennisGame {
        private Player player1;
        private Player player2;
        
        private boolean gameFinished;
        

        public TennisGame() {
        	gameFinished = false;
         	player1 = new Player();
         	player2 = new Player();
        	//playerScores(player1);
        	//playerScores(player2);
        	//playerScores(player1);
         	//playerScores(player1);
        	//playerScores(player2);
                
         	System.out.println(getScores());
        }

        private void  checkGameFinished() {
        	if (player1.getPoints()>=4 && player1.getPoints()-player2.getPoints()>=2)
            	gameFinished = true;
            else if (player2.getPoints()>=4 && player2.getPoints()-player1.getPoints()>=2)
            	gameFinished = true;
        }
        
        public void playerScores(Player p)  {
        	if (gameFinished) {
        		System.out.println("the game has finished");
            }
            else {
            	p.increasePoints();
            	checkGameFinished();
            }                        
        }
        
        public String getScores() { 
        	if (gameFinished) {
            	if (player1.getPoints() > player2.getPoints())
                	return "player1 wins";
                else
                	return "player2 wins";
            }
                                        
            if (player1.getPoints() >= 3 && player1.getPoints() == player2.getPoints())
            	return "deuce";
                                        
            if (player1.getPoints() >= 4 && player1.getPoints() - player2.getPoints() == 1)
            	return "player1 has advantage";
                                        
            if (player2.getPoints() >= 4 && player2.getPoints() - player1.getPoints() == 1)
            	return "player2 has advantage";                                                        
                                        
            return  player1.pointsToString() + " - " + player2.pointsToString();
       }
}

class Player {
        private int points;
        
        public Player() {
                points = 0;
        }
        
        public int getPoints() {
                return points;
        }
        
        public String pointsToString() {
                switch (points) {
                	case 0: return "love";
                	case 1: return "15";
                    case 2: return "30";
                    case 3: return "40";
                    default: return "bug";
                }
        }
                
        public void setPoints(int points) {
        	this.points = points;
        }
        
        public void increasePoints() {
        	this.points++;
        }
        
}
