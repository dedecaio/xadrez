package com.caioprogramador.chess.pieces;

import com.caioprogramador.boardgame.Board;
import com.caioprogramador.chess.ChessPiece;
import com.caioprogramador.chess.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][]mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
