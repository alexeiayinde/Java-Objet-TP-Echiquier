
public class Dame extends Piece {

	public Dame(char couleur, Position position) {
		super(couleur, position);
		this.symbole = 'D';
		this.valeur = 9;
	}

	@Override
	public boolean positionPossible(Position p) {
		if (p.getX() == position.getX() && p.getY() != position.getY()) // D�placement vertical
			return true;
		if (p.getX() != position.getX() && p.getY() == position.getY()) // D�placement horizontal
			return true;
		if (p.getX() - position.getX() == p.getY() - position.getY()) // D�placement diagonal ++
			return true;
		if (position.getX() - p.getX() == position.getY() - p.getY()) // D�placement diagonal --
			return true;
		if (p.getX() - position.getX() == position.getY() - p.getY()) // D�placement diagonal +-
			return true;
		if (position.getX() - p.getX() == p.getY() - position.getY()) // D�placement diagonal -+
			return true;

		return false;
	}

}
