
public class Roi extends Piece {

	public Roi(char couleur, Position position) {
		super(couleur, position);
		this.symbole = 'R';
		this.valeur = 20;
	}

	@Override
	public boolean positionPossible(Position p) {
		if ((p.getX() == position.getX() && p.getY() == position.getY() + 1))
			return true;
		if ((p.getX() == position.getX() && p.getY() == position.getY() - 1))
			return true;
		if ((p.getX() == position.getX() + 1 && p.getY() == position.getY()))
			return true;
		if ((p.getX() == position.getX() - 1 && p.getY() == position.getY()))
			return true;
		if (p.getX() == position.getX() + 1 && p.getY() == position.getY() + 1)
			return true;
		if (p.getX() == position.getX() + 1 && p.getY() == position.getY() - 1)
			return true;
		if (p.getX() == position.getX() - 1 && p.getY() == position.getY() + 1)
			return true;
		if (p.getX() == position.getX() - 1 && p.getY() == position.getY() - 1)
			return true;

		return false;
	}

}
