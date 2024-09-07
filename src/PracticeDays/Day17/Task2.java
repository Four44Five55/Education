package PracticeDays.Day17;

public class Task2 {
    public static void main(String[] args) {
        ChessBoard chessBoard=new ChessBoard(new ChessPiece[][]{
                {ChessPiece.PAWN_BLACK,ChessPiece.PAWN_BLACK,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_WHITE,ChessPiece.PAWN_WHITE,ChessPiece.EMPTY,ChessPiece.EMPTY,ChessPiece.PAWN_BLACK}
        });
        chessBoard.print();
    }

}
