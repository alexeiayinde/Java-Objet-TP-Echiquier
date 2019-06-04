import java.util.ArrayList;

public class Echiquier {

	private ArrayList<Piece> pieces = new ArrayList();;

	public Echiquier() {
	}

	public ArrayList<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(ArrayList<Piece> pieces) {
		this.pieces = pieces;
	}

	public void ajouterPiece(Piece p) {
		this.pieces.add(p);
	}

	public Piece getPiece(Position p) {
		for (int i = 0; i < pieces.size(); i++) {
			if (pieces.get(i).getPosition().getX() == p.getX() && pieces.get(i).getPosition().getY() == p.getY())
				return pieces.get(i);
		}

		return null;
	}

	public int getPoints(char couleur) {
		int points = 0;

		for (int i = 0; i < pieces.size(); i++) {
			if (pieces.get(i).getCouleur() == couleur)
				points += pieces.get(i).getValeur();
		}

		return points;
	}

	public void afficher() {
		System.out.println("   |  A   |  B   |  C   |  D   |  E   |  F   |  G   |  H   | ");
		System.out.println("------------------------------------------------------------");

		for (int i = 0; i < 8; i++) {
			System.out.print(" " + i + " |");
			for (int j = 0; j < 8; j++) {
				System.out.print(" ");
				for (int k = 0; k < pieces.size(); k++) {
					if (pieces.get(k).getPosition().getX() == j && pieces.get(k).getPosition().getY() == i)
						System.out.print(pieces.get(k).getSymbole());
					else
						System.out.print(" ");
				}
				System.out.print(" |");
			}
			System.out.println(" \n------------------------------------------------------------");
		}
	}

}
