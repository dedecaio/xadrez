package com.caioprogramador.chess.pieces;

import com.caioprogramador.boardgame.Board;
import com.caioprogramador.chess.ChessPiece;
import com.caioprogramador.chess.Color;

public class Rook extends ChessPiece {
    public Rook(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "R";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][]mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
