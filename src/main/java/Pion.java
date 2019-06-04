
public class Pion extends Piece {

	public Pion(char couleur, Position position) {
		super(couleur, position);
		this.symbole = 'P';
		this.valeur = 1;
	}

	@Override
	public boolean positionPossible(Position p) {
		if (p.getX() == position.getX() && p.getY() == position.getY() + 1)
			return true;
		return false;
	}

}
