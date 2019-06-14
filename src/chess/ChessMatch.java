package chess;

import boardgame.Board;

public class ChessMatch {
	// Pq uma partida de xadrez precisa ter um board
	private Board board;

	public ChessMatch() {
		this.board = new Board(8, 8); // Quem sabe o tamanho do tabuleiro
	}

	// Retorna uma matriz referente a partida
	public ChessPiece[][] getPieces() {
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];
		for(int i = 0; i < board.getRows(); i++) {
			for( int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}
	
}
