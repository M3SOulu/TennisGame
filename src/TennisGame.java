import java.util.Random;

/**
 * simulate a Tennis Game
 * @author Luigi
 *
 */
public class TennisGame {
	Match match;
	
	public TennisGame( Match match ) throws InvalidMatchException
	{
		if( match == null ){
			throw new InvalidMatchException();
		}
		
		this.match = match;
	}
	
	public void play()
	{
		Random random = new Random();
		boolean value;
		
		while( true ){
			try{
				System.out.println( match.getMatchState() );
				
				value = random.nextBoolean();
				match.setScoring( value, ! value );
			}
			catch( MatchAlreadyWonException e ){
				//Match is finished
				break;
			}
		}
	}
	
	public static void init() throws InvalidMatchException
	{
		Match m = null;
		
		try {
			m = new Match( new Player(), new Player() );
		} catch (InvalidPlayerException e) {
			// TODO Auto-generated catch block
			System.out.println( e.getMessage() );
		}
		
		TennisGame tennisGame = new TennisGame( m );
		tennisGame.play();
	}
	
	public static void main( String[] args ){
		try{
			init();
		}
		catch( InvalidMatchException e ){
			System.out.println( e.getMessage() );
		}
	}
	
	
	
}
