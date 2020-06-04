
public class Client {

	public static void main(String[] args) {
		Board b = new Board(8);
		b.placeQueen(1, 1);
		b.state();
		System.out.println(b.isSafe(2, 2));
		b.removeQueen(2, 2);
		System.out.println();
		b.state();
	}
	
	/*
	 * Client method used to solve board
	 * 
	 * @param Board b
	 */
	public static void solve(Board b) {

	}
	
	/*
	 * Private method that actually solves problem
	 * 
	 * @param Board b
	 * @param int col
	 */
	private static boolean backtrack(Board b, int column) {
		//success path
		if(column>b.getSize()) {
			return true;
		//exploratory path
		}else {
			for(int row = 1 ; row <= b.getSize(); row++) {
				if(b.isSafe(row, column)) {
					b.placeQueen(row, column);
					if(backtrack(b, column +1)) {
						return true;
					}
					b.removeQueen(row, column);
				}
			}
			return false;
		}
	}

}
