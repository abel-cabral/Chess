package boardgame;

public class Piece {
	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		setPosition(null);
	}

	private void setPosition(Position position) {
		this.position = position;
	}

	protected Board getBoard() {
		return board;
	}
	
	
	
}
