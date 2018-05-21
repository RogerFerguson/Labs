package Lab_GUIhelp;

import java.awt.Point;
import java.util.*;

public class LabConnectFourGameEXAMPLE {
	
	private int[][] board;
	private int size;
	private int player;
	private int playerCount;
	private int connections;

	public LabConnectFourGameEXAMPLE (int pSize) {
		size = pSize;
		board = new int[pSize][pSize];
		this.playerCount = 2;
		this.connections = 4;
		this.player = 0;
		reset();
	}
	
	public void reset() {
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				board[i][j] = -1;
	}
	
	public int selectCol (int pCol) {
		for (int row = size - 1; row >= 0; row--) 
			if (board[row][pCol] == -1) {
				board[row][pCol] = player;
				return row;
			}
		return -1;
	}
	
	public int nextPlayer() {
		player = (player + 1) % playerCount;
		return player;
		
	}
	
	public int getCurrentPlayer () {
		return player;
	}
	
	public boolean isWinner() {
		/*
		 *    TODO 3:    
		 *    		Write code for a horizontal win of 4
		 *    
	



		 *    
		 */
	
		
		/*
		 *    TODO 4:    
		 *    		Change the code from TODO 3 to allow a horizontal win of any length, 
		 *    		defined by 'this.connections' (see above);
		 *    
		 *          Complete a veritical win.
		 *          Complete the two  diagonal wins (upper left,  upper right)
		 */
		return false;
	}
	
	/*
	 *  TO DO 5, if you have the time...
	 *  
	 *  Make an AI feature.  Use the following rules.
	 * 		1.	See if you can win. If so, select that column and win.
	 * 		2.	See if you are going to lose. If so, select the column that blocks that move.
	 *		3.	If rules 1 and 2 are not in play, then develop a tactic to select a column that may help you in the future.

	 */
}











