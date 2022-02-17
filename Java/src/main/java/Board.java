import figures.*;

import java.util.ArrayList;

public class Board {

    private final Spot[][] Square;

    public Board() {
        Square = new Spot[8][8];
        setSpots();
        setPiece();

        System.out.println();
        System.out.println("      [A][B][C][D][E][F][G][H] \n");
        for (int x = 0; x < 8; x++) {
            System.out.print("[" + (8 - x) + "]   ");

            for (int y = 0; y < 8; y++) {
                System.out.print(Square[x][y].getValue());
            }

            System.out.println("   [" + (8 - x) + "]");
        }

        System.out.println("\n      [A][B][C][D][E][F][G][H]\n");
    }

    public static void board(Spot[][] boardDraw) {
    }

    public void setSpots() {
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) {
                this.Square[x][y] = new Spot(null);
            }
        }
    }

    public void setPiece() {
        Square[7][0] = new Spot(new Rook(Color.BlACK, 'R'));
        Square[7][7] = new Spot(new Rook(Color.BlACK, 'R'));
        Square[7][1] = new Spot(new Knight(Color.BlACK, 'N'));
        Square[7][6] = new Spot(new Knight(Color.BlACK, 'N'));
        Square[7][2] = new Spot(new Bishop(Color.BlACK, 'B'));
        Square[7][5] = new Spot(new Bishop(Color.BlACK, 'B'));
        Square[7][3] = new Spot(new Queen(Color.BlACK, 'Q'));
        Square[7][4] = new Spot(new King(Color.BlACK, 'K'));


        for (int x = 0; x < 8; x++) {
            Square[6][x] = new Spot(new Pawn(Color.BlACK, 'P'));

        }
    }

    public Spot[][] getBoardDraw() {
        return Square;
    }

}

