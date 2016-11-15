
public class InvalidScoreException extends Exception{
	public InvalidScoreException()
	{
		super( "Invalid format score" );
	}
	
	public InvalidScoreException( String msg )
	{
		super( msg);
	}
}
