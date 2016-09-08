
public class player extends TennisGame {
	private String score=null;
	private String name=null;
	
	
	public player(String name){
		this.name=name;
		this.score="love";
		
	}
	public player(String name,String score){
		this.name=name;
		this.score=score;
	}
	public String getplayerScore(){
		return this.score;
	}
	
	private void setScore(String score){
		this.score=score;
	}
	
	private void win(){
		this.setScore("love");
		this.other().setScore("love");
		System.out.println(this.name + " wins the game");
	}
	private player other(){
		if(this.name=="player1") return player2;
		else return player1;
		
	}
	public void Scores(){
		if (this.score=="love") this.setScore("15");
		else {
			if (this.score=="15") this.setScore("30");
			else{ 
				if (this.score=="30") this.setScore("40");
				else { 
					if(TennisGame.getScore()=="deuce") this.setScore("adv");
					else{
						if(this.score=="40"&&this.other().score=="adv") { this.other().setScore("40");  }
						else{this.win();}

					}
					
					
							
				
				}
			}

		}
		
	}
}
