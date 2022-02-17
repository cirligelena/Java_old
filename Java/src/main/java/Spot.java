import figures.Piece;

public class Spot {
    private Piece piece;

    public Spot(Piece piece) {
        this.piece = piece;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setFigures(Piece piece) {
        this.piece = piece;
    }

    public String getValue() {
        if (piece != null) {
            return "[" + piece.getAlias() + "]";
        } else {
            return "[ ]";
        }
    }
}
