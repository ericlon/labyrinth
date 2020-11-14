package board;

import board.Base;

public class Board {
	
	public Base[][] board;
	
	public Board() {
		
		board = new Base[9][9];
		
		for (int x = 0; x < 9; x++) {
			for (int y = 0; y < 9; y++) {
				board[x][y] = new Base(x, y);
			}
		}
	}

}
