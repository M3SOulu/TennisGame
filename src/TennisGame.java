
public class TennisGame {

	private Player pl_1;
	private Player pl_2;
	static private Player winner;
	
	public Player getPl_1() {
		return pl_1;
	}

	public void setPl_1(Player pl_1) {
		this.pl_1 = pl_1;
	}

	public Player getPl_2() {
		return pl_2;
	}

	public void setPl_2(Player pl_2) {
		this.pl_2 = pl_2;
	}

	public Player getWinner() {
		return winner;
	}

	public static void setWinner(Player winner) {
		TennisGame.winner = winner;
	}

	public TennisGame(Player p1, Player p2){
		pl_1=p1;
		pl_2=p2;
	}
	
	public String scoreP1(){
		String result=null;
		if(winner==null){
			if(!pl_1.isAdvantage()&&!pl_2.isAdvantage()){
				if(pl_1.getPoints()==40&&pl_2.getPoints()==40){		//caso pareggio 40 40 p1 segna = P1 VANTAGGIO
					pl_1.setAdvantage(true);
					result=pl_1.getName()+" scores > Score: advantage - 40";
				}
				else{
					if(pl_1.getnScore()==2){
						pl_1.setPoints(10);
						if(pl_2.getPoints()==0){
							result=pl_1.getName()+" scores > Score: " + pl_1.getPoints() + " - love";	// caso punteggio normale
						}else if(pl_1.getPoints()==40 && pl_2.getPoints()==40){
							result=pl_1.getName()+" scores > Score: deuce";
						}
						else{
							result=pl_1.getName()+" scores > Score: " + pl_1.getPoints() + " - " + pl_2.getPoints();	// caso punteggio normale
						}
							
					}else if(pl_1.getPoints()==40){
						result=pl_1.getName()+" scores > Score: " + pl_1.getName() + " wins";
						winner=pl_1;
					}
					else{
						pl_1.setPoints(15);
						if(pl_2.getPoints()==0){
							result=pl_1.getName()+" scores > Score: " + pl_1.getPoints() + " - love";	// caso punteggio normale
						}else if(pl_1.getPoints()==40 && pl_2.getPoints()==40){
							result=pl_1.getName()+" scores > Score: deuce";
						}
						else{
							result=pl_1.getName()+" scores > Score: " + pl_1.getPoints() + " - " + pl_2.getPoints();	// caso punteggio normale
						}
					}
				}
			}
			else if(!pl_1.isAdvantage()&&pl_2.isAdvantage()){	// caso p1 non vantaggio e segna p2 vantaggio = PAREGGIO
				pl_2.setAdvantage(false);
				result=pl_1.getName()+" scores > Score: deuce";
				
			}
			else if(pl_1.isAdvantage()&&!pl_2.isAdvantage()){		//caso p1 ha vantaggio e segna p2 non vantaggio = P1 VINCE
				winner=pl_1;
				result=pl_1.getName()+" scores > Score: " + pl_1.getName() + " wins";
			}
		}
		else{
			result=winner.getName() +" wins";
		}

		return result;
		
	}
	
	public String scoreP2(){
		String result=null;
		
		if(winner==null){
			if(!pl_1.isAdvantage()&&!pl_2.isAdvantage()){
				if(pl_1.getPoints()==40&&pl_2.getPoints()==40){		//caso pareggio 40 40 p2 segna = P2 VANTAGGIO
					pl_2.setAdvantage(true);
					result=pl_2.getName()+" scores > Score: 40 - advantage";
				}
				else{
					if(pl_2.getnScore()==2){
						pl_2.setPoints(10);
						if(pl_1.getPoints()==0){
							result=pl_2.getName()+" scores > Score: love - " + pl_2.getPoints();	// caso punteggio normale
						}else if(pl_1.getPoints()==40 && pl_2.getPoints()==40){
							result=pl_2.getName()+" scores > Score: deuce";
						}
						else{
							result=pl_2.getName()+" scores > Score: " + pl_1.getPoints() + " - " + pl_2.getPoints();	// caso punteggio normale
						}
					}else if(pl_2.getPoints()==40){
						result=pl_2.getName()+" scores > Score: " + pl_2.getName() + " wins";
						winner=pl_2;
					}
					else{
						pl_2.setPoints(15);
						if(pl_1.getPoints()==0){
							result=pl_2.getName()+" scores > Score: love - " + pl_2.getPoints();	// caso punteggio normale
						}else if(pl_1.getPoints()==40 && pl_2.getPoints()==40){
							result=pl_2.getName()+" scores > Score: deuce";
						}
						else{
							result=pl_2.getName()+" scores > Score: " + pl_1.getPoints() + " - " + pl_2.getPoints();	// caso punteggio normale
						}
				}	}
			}
			else if(pl_1.isAdvantage()&&!pl_2.isAdvantage()){	// caso p1 vantaggio p2 non vantaggio e segna = PAREGGIO
				pl_1.setAdvantage(false);
				result=pl_2.getName()+" scores > Score: deuce";
				
			}
			else if(!pl_1.isAdvantage()&&pl_2.isAdvantage()){		//caso p1 non ha vantaggio e p2 ha vantaggio e segna = P2 VINCE
				winner=pl_2;
				result=pl_2.getName()+" scores > Score: " + winner.getName() + " wins";
			}
		}
		else{
			result=winner.getName() +" wins";
		}
		
		return result;
		
	}
	
	
	
}
