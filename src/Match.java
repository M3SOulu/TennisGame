import java.util.ArrayList;
import java.util.List;

public class Match {
	private List<Point> points;
	private int winnerPointPlayer1 = 0;
	private int winnerPointPlayer2 = 0;
	
	public Match()
	{
		points = new ArrayList<>();
	}
	
	public void addPoint( Point p )
	{
		points.add( p );
	}
	
	private void winnerPoint(Point p){
		if(p.getWinner().getId() == 1){
			this.winnerPointPlayer1++;
		}else{
			this.winnerPointPlayer2++;
		}
		
	}
}
