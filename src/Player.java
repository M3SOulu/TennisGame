import java.util.ArrayList;

public class Player {
	public static ArrayList<String> scoresArray = new ArrayList<String>();
	private String name;	
	private int score;
	
	Player(String name){
		scoresSetUp();
		this.name=name;
		score = 0;
	}
	
	public void incScore(){
		score++;
	}
	
	int getScore(){
		return this.score;
	}
	String getName(){
		return this.name;
	}
	
	String getScoreString(){
		return this.scoresArray.get(score);
	}
	
	void scoresSetUp(){
		this.scoresArray.add("love");
		this.scoresArray.add("15");
		this.scoresArray.add("30");
		this.scoresArray.add("40");
		this.scoresArray.add("Douce");
		this.scoresArray.add("Advantage");
	}
	
	@Override
	public boolean equals(Object o){
		Player p2 = (Player) o;
		return (this.getName()==p2.getName()); 	
	}
}
