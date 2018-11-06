public class Board {
    Piece[] redPieces;
    Piece[] blackPieces;
    Piece[][] boardState;
    boolean gameOn;

    public Board(Piece[] redPieces, Piece[] blackPieces, Piece[][] boardState, boolean gameOn){
         this.redPieces = redPieces;
         this.blackPieces = blackPieces;
         this.boardState = boardState;
         this.gameOn = gameOn;
    }



}
