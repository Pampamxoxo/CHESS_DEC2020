public abstract class  Piece {
    private boolean white=false;
    private boolean black=false;

    public boolean isWhite() {
        return white;
    }

    public void setWhite(boolean white) {
        this.white = white;
    }

    public boolean isBlack() {
        return black;
    }

    public void setBlack(boolean black) {
        this.black = black;
    }
    abstract public boolean AllowedMove(Move move, Cell start, Cell dest );
}
