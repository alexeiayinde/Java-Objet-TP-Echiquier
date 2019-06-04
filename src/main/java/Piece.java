import java.io.Serializable;

public abstract class Piece implements Serializable {

	protected char couleur;
	protected Position position;
	protected char symbole;
	protected int valeur;

	protected Piece(char couleur, Position position) {
		this.couleur = couleur;
		this.position = position;
	}

	public abstract boolean positionPossible(Position p);

	protected char getSymbole() {
		return this.symbole;
	}

	protected int getValeur() {
		return this.valeur;
	}

	protected char getCouleur() {
		return couleur;
	}

	protected void setCouleur(char couleur) {
		this.couleur = couleur;
	}

	protected Position getPosition() {
		return position;
	}

	protected void setPosition(Position position) {
		this.position = position;
	}

	protected void deplacement(Position p) throws ExceptionPosition {
		if (this.positionPossible(p))
			this.position = p;
		else
			throw new ExceptionPosition();
	}

	@Override
	public String toString() {
		return "Pièce : " + this.symbole + "\nCouleur : " + this.couleur + "\nPosition : " + this.position;
	}

}
