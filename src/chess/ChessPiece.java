package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

    private Color color;

    public ChessPiece(Board board, ChessPiece chessPiece) {
        super(board);
        chessPiece.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
