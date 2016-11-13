
public class MatchAlreadyWonException extends Exception {
	public MatchAlreadyWonException()
	{
		super( "This match was already won" );
	}

	public MatchAlreadyWonException( String msg )
	{
		super( msg);
	}
}
