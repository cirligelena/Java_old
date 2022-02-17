public class Move {
    private Spot start;
    private Spot end;

    public Move(Spot start, Spot end) {
        this.start = start;
        this.end = end;
    }

    public Spot getStart() {
        return start;
    }

    public Spot getEnd() {
        return end;
    }
}
