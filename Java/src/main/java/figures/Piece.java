package figures;

public abstract class Piece {
    private final Color color;
    private final char alias;

    public Piece(Color color, char alias) {
        this.color = color;
        this.alias = alias;
    }


    public char getAlias() {
        return alias;
    }

    public abstract void HowItMoves();

}