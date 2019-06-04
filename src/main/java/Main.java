
public class Main {

	public static void main(String[] args) {

		Echiquier chess = new Echiquier();
		chess.ajouterPiece(new Roi('N', new Position(4, 3)));
		chess.ajouterPiece(new Dame('B', new Position(5, 2)));
		chess.ajouterPiece(new Cavalier('N', new Position(4, 1)));
		chess.ajouterPiece(new Pion('N', new Position(2, 2)));

		System.out.println("La valeur du joueur noir est : " + chess.getPoints('N'));
		System.out.println("La valeur du joueur blanc est : " + chess.getPoints('B') + "\n");

		try {
			chess.getPiece(new Position(4, 3)).deplacement(new Position(6, 3));
		} catch (ExceptionPosition e) {
		}

		try {
			chess.getPiece(new Position(2, 2)).deplacement(new Position(2, 3));
		} catch (ExceptionPosition e) {
			e.printStackTrace();
		}

		System.out.println("");

		chess.afficher();

		System.out.println("\n" + chess.getPiece(new Position(4, 3)));

	}

}
