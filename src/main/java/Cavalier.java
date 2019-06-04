
public class Cavalier extends Piece {

	public Cavalier(char couleur, Position position) {
		super(couleur, position);
		this.symbole = 'C';
		this.valeur = 3;
	}

	@Override
	public boolean positionPossible(Position p) {
		if (p.getX() == position.getX() + 2 && p.getY() == position.getY() + 1)
			return true;
		if (p.getX() == position.getX() + 2 && p.getY() == position.getY() - 1)
			return true;
		if (p.getX() == position.getX() + 1 && p.getY() == position.getY() + 2)
			return true;
		if (p.getX() == position.getX() + 1 && p.getY() == position.getY() - 2)
			return true;
		if (p.getX() == position.getX() - 2 && p.getY() == position.getY() + 1)
			return true;
		if (p.getX() == position.getX() - 2 && p.getY() == position.getY() - 1)
			return true;
		if (p.getX() == position.getX() - 1 && p.getY() == position.getY() + 2)
			return true;
		if (p.getX() == position.getX() - 1 && p.getY() == position.getY() - 2)
			return true;

		return false;
	}

}
