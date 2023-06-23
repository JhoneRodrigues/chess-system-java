package boardgame;

public class Board {
	private int row;
	private int columns;
	private Piece[][] pieces;
	
	public Board(int row, int columns) {
		this.row = row;
		this.columns = columns;
		pieces = new Piece [row][columns];
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	public Piece piece (int row,int column) {
		return pieces[row][column];
	}
	
	public Piece piece (Position position) {
		return pieces[position.getRow()][position.getColumn()];
	}
	
}
