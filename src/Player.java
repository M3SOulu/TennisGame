import java.util.Arrays;
import java.util.List;

public class Player{
	
	public static final List<String> points = Arrays.asList("love", "15", "30", "40");
	private String name;
	private int score;
	
	public Player(String name){
	    this.setName(name);
	}
	 
    
    public int getScore() {
        return score;
    }
    
    
    public String getName() {
        return name;
    }

    public void winPoint() {
        this.score = this.score + 1;
    }
    
    void setName(String name){
    	this.name = name;
    }
    
    public String getScoreDescription(){
        return points.get(score);
    }
    
    @Override
    public boolean equals(Object o){
    	Player p2 = (Player) o;
    	return(p2.getName() == this.name);
    }
}
