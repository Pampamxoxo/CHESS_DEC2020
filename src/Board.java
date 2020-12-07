public class Board {

    private Cell[] board= new Cell[8];

    public Board(Cell[] board) {
        this.board = board;
    }

    public Cell[] getBoard() {
        return board;
    }

    public void setBoard(Cell[] board) {
        this.board = board;
    }
    public boolean put(Piece p, Cell dest) {
        if(dest.getPiece()==null&&p.AllowedMove()){
            dest.setPiece(p);
            return true;
        }
        return false;
    }

}
