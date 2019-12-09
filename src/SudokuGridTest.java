import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SudokuGridTest {
	
	@Test
	void test1() {
		int[][] board = new int[][]
				{{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
				{5, 2, 0, 0, 0, 0, 0, 0, 0}, 
				{0, 8, 7, 0, 0, 0, 0, 3, 1}, 
				{0, 0, 3, 0, 1, 0, 0, 8, 0}, 
				{9, 0, 0, 8, 6, 3, 0, 0, 5}, 
				{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
				{1, 3, 0, 0, 0, 0, 2, 5, 0}, 
				{0, 0, 0, 0, 0, 0, 0, 7, 4}, 
				{0, 0, 5, 2, 0, 6, 3, 0, 0}};
	
	
	SudokuGrid problem1 = new SudokuGrid(board);
	
	int[][] boardKey = new int[][] 
			{{3, 0, 6, 5, 0, 8, 4, 0, 0}, 
			{5, 2, 0, 0, 0, 0, 0, 0, 0}, 
			{0, 8, 7, 0, 0, 0, 0, 3, 1}, 
			{0, 0, 3, 0, 1, 0, 0, 8, 0}, 
			{9, 0, 0, 8, 6, 3, 0, 0, 5}, 
			{0, 5, 0, 0, 9, 0, 6, 0, 0}, 
			{1, 3, 0, 0, 0, 0, 2, 5, 0}, 
			{0, 0, 0, 0, 0, 0, 0, 7, 4}, 
			{0, 0, 5, 2, 0, 6, 3, 0, 0}};
	
	
	assertArrayEquals(boardKey, problem1.getGrid());
}

}
