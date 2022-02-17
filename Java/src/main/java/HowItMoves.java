public interface HowItMoves {
    public String KingMove = "KING: The king can only move one square in any direction - up, down, to the sides, and diagonally. \n";
    public String QueenMove = "QUEEN: She can move in any one straight direction - forward, backward, sideways, " +
            "or diagonally - as far as possible as long as she does not move through any of her own pieces. \n";
    public String RookMove = "ROOK: The rook may move as far as it wants, but only forward, backward, and to the sides.\n";
    public String BishopMove = "BISHOP: The bishop may move as far as it wants, but only diagonally. " +
            "Each bishop starts on one color (light or dark) and must always stay on that color. \n";
    public String KnightMove = "KNIGHT: Knights move in a very different way from the other pieces going two squares in one direction, " +
            "and then one more move at a 90 degree angle, just like the shape of an L \n";
    public String PawnMove = "PAWN: Pawns are unusual because they move and capture in different ways: they move forward, but capture diagonally. " +
            "Pawns can only move forward one square at a time, except for their very first move where they can move forward two squares. \n";
          
    void HowItMoves();
}
