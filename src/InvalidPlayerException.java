
public class InvalidPlayerException extends Exception {
	public InvalidPlayerException()
	{
		super( "Invalid player" );
	}
	
	public InvalidPlayerException( String msg )
	{
		super( msg);
	}
}
