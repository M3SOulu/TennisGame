public class TennisGame {
	
	public int p1score = 0;
	public int p2score = 0;
	public String p1String = "love";
	public String p2String = "love";
	
	public void Everything(){
		if (p1score == 1){
			p1String = "fifteen";
		}else if(p1score == 2){
			p1String = "thirty";
		}else if(p1score == 3){
			p1String = "forty";
		}
		
		if (p2score == 1){
			p2String = "fifteen";
		}else if(p2score == 2){
			p2String = "thirty";
		}else if(p2score == 3){
			p2String = "forty";
		}
	}
	
	public void getScore(){
	
	}
	public void setScore(int p1score, int p2score){
		this.p1score = p1score;
		this.p2score = p2score;
	}
}
