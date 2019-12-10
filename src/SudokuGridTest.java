import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SudokuGridTest {

	@Test
	void sudokuProblem1() {
		int[][] board = new int[][] { { 3, 0, 6, 5, 0, 8, 4, 0, 0 }, { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 8, 7, 0, 0, 0, 0, 3, 1 }, { 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 }, { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
				{ 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		SudokuGrid problem1 = new SudokuGrid(board);

		int[][] boardKey = new int[][] { { 3, 1, 6, 5, 7, 8, 4, 9, 2 }, { 5, 2, 9, 1, 3, 4, 7, 6, 8 },
				{ 4, 8, 7, 6, 2, 9, 5, 3, 1 }, { 2, 6, 3, 4, 1, 5, 9, 8, 7 }, { 9, 7, 4, 8, 6, 3, 1, 2, 5 },
				{ 8, 5, 1, 7, 9, 2, 6, 4, 3 }, { 1, 3, 8, 9, 4, 7, 2, 5, 6 }, { 6, 9, 2, 3, 5, 1, 8, 7, 4 },
				{ 7, 4, 5, 2, 8, 6, 3, 1, 9 } };

		problem1.solveSudoku();

		assertArrayEquals(boardKey, problem1.getGrid());
	}

	@Test
	void sudokuProblem2() {
		int[][] board = new int[][] { { 8, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 3, 6, 0, 0, 0, 0, 0 },
				{ 0, 7, 0, 0, 9, 0, 2, 0, 0 }, { 0, 5, 0, 0, 0, 7, 0, 0, 0 }, { 0, 0, 0, 0, 4, 5, 7, 0, 0 },
				{ 0, 0, 0, 1, 0, 0, 0, 3, 0 }, { 0, 0, 1, 0, 0, 0, 0, 6, 8 }, { 0, 0, 8, 5, 0, 0, 0, 1, 0 },
				{ 0, 9, 0, 0, 0, 0, 4, 0, 0 } };

		SudokuGrid problem2 = new SudokuGrid(board);

		int[][] boardKey = new int[][] { { 8, 1, 2, 7, 5, 3, 6, 4, 9 }, { 9, 4, 3, 6, 8, 2, 1, 7, 5 },
				{ 6, 7, 5, 4, 9, 1, 2, 8, 3 }, { 1, 5, 4, 2, 3, 7, 8, 9, 6 }, { 3, 6, 9, 8, 4, 5, 7, 2, 1 },
				{ 2, 8, 7, 1, 6, 9, 5, 3, 4 }, { 5, 2, 1, 9, 7, 4, 3, 6, 8 }, { 4, 3, 8, 5, 2, 6, 9, 1, 7 },
				{ 7, 9, 6, 3, 1, 8, 4, 5, 2 } };

		problem2.solveSudoku();

		assertArrayEquals(boardKey, problem2.getGrid());
	}

	@Test
	void completedSudokuCorrect() {
		int[][] board = new int[][] { { 8, 1, 2, 7, 5, 3, 6, 4, 9 }, { 9, 4, 3, 6, 8, 2, 1, 7, 5 },
				{ 6, 7, 5, 4, 9, 1, 2, 8, 3 }, { 1, 5, 4, 2, 3, 7, 8, 9, 6 }, { 3, 6, 9, 8, 4, 5, 7, 2, 1 },
				{ 2, 8, 7, 1, 6, 9, 5, 3, 4 }, { 5, 2, 1, 9, 7, 4, 3, 6, 8 }, { 4, 3, 8, 5, 2, 6, 9, 1, 7 },
				{ 7, 9, 6, 3, 1, 8, 4, 5, 2 } };

		SudokuGrid correct = new SudokuGrid(board);

		assertTrue(correct.solveSudoku());
	}

	@Test
	void emptySudoku() {
		int[][] board = new int[][] { { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0 } };

		SudokuGrid empty = new SudokuGrid(board);

		int[][] boardKey = new int[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 4, 5, 6, 7, 8, 9, 1, 2, 3 },
				{ 7, 8, 9, 1, 2, 3, 4, 5, 6 }, { 2, 1, 4, 3, 6, 5, 8, 9, 7 }, { 3, 6, 5, 8, 9, 7, 2, 1, 4 },
				{ 8, 9, 7, 2, 1, 4, 3, 6, 5 }, { 5, 3, 1, 6, 4, 2, 9, 7, 8 }, { 6, 4, 2, 9, 7, 8, 5, 3, 1 },
				{ 9, 7, 8, 5, 3, 1, 6, 4, 2 } };

		empty.solveSudoku();

		assertArrayEquals(boardKey, empty.getGrid());
	}

}
