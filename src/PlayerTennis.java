
public class PlayerTennis extends Player {

	PlayerTennis(int id) {
		super(id);
	}

	@Override
	public void addPoint() throws InvalidNumberPoint {
		switch (score) {
		case 0:
			score = 15;
			break;
		case 15:
			score = 30;
			break;
		case 30:
			score = 40;
			break;
		default:
			throw new InvalidNumberPoint();
		}

	}

}
