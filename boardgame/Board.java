package boardgame;

public class Board {
    private int rows;
    private int colomns;
    private Piece[][] piece;

    public Board(int rows, int colomns) {
        this.rows = rows;
        this.colomns = colomns;
        piece = new Piece[rows][colomns];
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getColomns() {
        return colomns;
    }

    public void setColomns(int colomns) {
        this.colomns = colomns;
    }

    


    
}
