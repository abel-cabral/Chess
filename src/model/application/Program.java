package model.application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		// Unicializa o tabuleiro
		ChessMatch chessMatch = new ChessMatch();
		
		// Imprime a disposicao atual do tabuleiro
		UI.printBoard(chessMatch.getPieces());
	}

}
