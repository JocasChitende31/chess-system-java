package chess;

import boardgame.Board;

import chess.pieces.King;
import chess.pieces.Queen;
import chess.pieces.Rook;

public class ChessMatch {

	private Board board;

	public ChessMatch() {
		board = new Board(8, 8);
		initialSetup();
	}

	public ChessPiece[][] getPieces() {

		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

		for (int i = 0; i < board.getRows(); i++) {
			for (int j = 0; j < board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i, j);
			}
		}
		return mat;
	}

	public void placeNewPiece(char column, int row, ChessPiece pice) {
		board.placePiece(pice, new ChessPosition(row, column).toPosition());
	}

	public void initialSetup() {

		placeNewPiece('b', 6, new King(board, Color.WHITE));
		placeNewPiece('e', 8, new Rook(board, Color.BLACK));
		placeNewPiece('e', 1, new Queen(board, Color.WHITE));
	}
}
