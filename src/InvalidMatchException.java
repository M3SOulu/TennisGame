
public class InvalidMatchException extends Exception {
	public InvalidMatchException()
	{
		super( "Invalid match" );
	}

	public InvalidMatchException( String msg )
	{
		super( msg);
	}
}
