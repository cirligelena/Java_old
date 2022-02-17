import figures.King;

public class Chess {

    public static void main(String[] args) {
        Board board = new Board();
        Board.board(board.getBoardDraw());
        System.out.println();
        System.out.println(HowItMoves.KingMove);
        System.out.println(HowItMoves.QueenMove);
        System.out.println(HowItMoves.BishopMove);
        System.out.println(HowItMoves.PawnMove);
        System.out.println(HowItMoves.RookMove);
        System.out.println(HowItMoves.KnightMove);
    }

}