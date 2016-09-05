
public enum ScoreValue {
	love, fifteen, thirty, forty, deuce, advantage;
	
	public ScoreValue nextValue() {
		ScoreValue[] values = values();
		
		int nextIndex = this.ordinal();
		if (nextIndex < values.length - 1)
			nextIndex++;
		
		return values[nextIndex];
	}
};
