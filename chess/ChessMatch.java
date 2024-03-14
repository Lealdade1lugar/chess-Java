package chess;

import boardgame.Board;

public class ChessMatch {

    private Board board;
    
    public ChessMatch(){
        board = new Board(8, 8);
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColomns()];
        for(int i=0;i<board.getRows();i++){
            for(int j=0;j<board.getColomns();j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    
}
