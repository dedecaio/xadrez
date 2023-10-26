package com.caioprogramador.chess;

import com.caioprogramador.boardgame.Board;
import com.caioprogramador.boardgame.Piece;

public abstract class ChessPiece extends Piece {
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
