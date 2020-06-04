import java.util.Arrays;

public class Board {

	private int size;
	private int[][] queens;

	/*
	 * Constructor
	 * 
	 * @param int size
	 */
	public Board(int size) {
		this.size = size;
		this.queens = new int[size][size];
	}

	/*
	 * Determines whether Queen is safe, at a given index, to be placed or not
	 * 
	 * @param int row
	 * 
	 * @param int column
	 * 
	 * @return boolean
	 */
	public boolean isSafe(int row, int column) {
		// to manage index
		int realRow = row - 1;
		int realCol = column - 1;

		int diagonalRow = realRow;
		int diagonalCol = realCol;

		// checks the row up till column for any queens
		for (int x = realCol; x >= 0; x--) {
			if (this.queens[realRow][x] == 1) {
				return false;
			}
		}

		// checking spots diagonally above and to the left of index
		while (diagonalRow >= 0 && diagonalCol >= 0) {
			if (this.queens[diagonalRow][diagonalCol] == 1) {
				return false;
			}
			diagonalRow--;
			diagonalCol--;
		}

		// reset diagonal row and column variables for other direction
		diagonalRow = realRow;
		diagonalCol = realCol;

		// checking spots diagonally below and to the left of index
		while (diagonalRow < this.size && diagonalCol >= 0) {
			if (this.queens[diagonalRow][diagonalCol] == 1) {
				return false;
			}
			diagonalRow++;
			diagonalCol--;
		}

		return true;
	}

	/*
	 * Place Queen at given index
	 * 
	 * @param int row
	 * 
	 * @param int column
	 */
	public void placeQueen(int row, int column) {
		this.queens[row - 1][column - 1]++;
	}

	/*
	 * Removes Queen from given index
	 * 
	 * @param int row
	 * 
	 * @param int column
	 */
	public void removeQueen(int row, int column) {
		this.queens[row - 1][column - 1]--;
	}

	/*
	 * Prints state of board
	 */
	public void state() {
		for (int[] x : this.queens) {
			System.out.println(Arrays.toString(x));
		}
	}

	/*
	 * Gets size of board
	 * 
	 * @return int
	 */
	public int getSize() {
		return this.size;
	}

}
