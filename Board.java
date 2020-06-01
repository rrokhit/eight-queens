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
	 * Determines whether Queen is safe to be placed or not 
	 * 
	 * @param int row
	 * @param int column 
	 * @return boolean  
	 */
//	public boolean isSafe(int row, int column) {
//		
//	}
	
	/*
	 * Place Queen at given index 
	 * 
	 * @param int row 
	 * @param int column 
	 */
	public void placeQueen(int row, int column) {
		this.queens[row-1][column-1]++;
	}
	
	/*
	 * Removes Queen from given index 
	 * 
	 * @param int row
	 * @param int column
	 */
	public void removeQueen(int row, int column) {
		this.queens[row-1][column-1]--;
	}
	
	/*
	 * Prints state of board 
	 */
	public void state() {
		for(int[] x : this.queens) {
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
