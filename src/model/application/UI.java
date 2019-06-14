package model.application;

import chess.ChessPiece;

public class UI {
	public static void printBoard(ChessPiece[][] pieces) {

		// Considerando que largura e altura sao iguais
		for (int i = 0; i < pieces.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j = 0; j < pieces.length; j++) {
				printPiece(pieces[i][j]);
			}
			System.out.println();
		}
		System.out.println(" a b c d e f g h");
	}

	// Trata e imprimir 1 posicao do tabuleiro
	private static void printPiece(ChessPiece piece) {
		if (piece == null) {
			System.out.print("-");
		} else {
			System.out.print(piece);
		}
		System.out.print(" "); // evitar que fiquem grudadas
	}
}
