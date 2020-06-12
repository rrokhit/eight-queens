
public class Client {

	public static void main(String[] args) {
		Board b = new Board(25);
		solve(b);
	}
	
	/**
	 * Client method used to solve board
	 * 
	 * @param Board b
	 */
	public static void solve(Board board) {
		if(backtrack(board,1)) {
			System.out.println("Solution found:");
			board.state();
		}else {
			System.out.println("No solutions found");
		}
	}
	
	/**
	 * Private method that actually solves problem
	 * 
	 * @param Board board
	 * @param int column
	 * @return boolean 
	 */
	private static boolean backtrack(Board board, int column) {
		//success path
		if(column>board.getSize()) {
			return true;
		//exploratory path
		}else {
			for(int row = 1 ; row <= board.getSize(); row++) {
				if(board.isSafe(row, column)) {
					board.placeQueen(row, column);
					if(backtrack(board, column +1)) {
						return true;
					}
					board.removeQueen(row, column);
				}
			}
			return false;
		}
	}

}
