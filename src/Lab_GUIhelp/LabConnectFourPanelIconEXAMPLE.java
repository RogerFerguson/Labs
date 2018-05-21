package Lab_GUIhelp;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class LabConnectFourPanelIconEXAMPLE extends JPanel {
	
	private final int SIZE = 10;    
	private JLabel[][] matrix;
	private JButton[] selection;
	
	private Boolean person = true;
	private JMenuItem gameItem;
	private JMenuItem quitItem;
	private ImageIcon iconBlank;
	private ImageIcon iconPlayer1;
	private ImageIcon iconPlayer2;
	
	private LabConnectFourGameEXAMPLE game;
	
	public LabConnectFourPanelIconEXAMPLE(JMenuItem pquitItem, JMenuItem pgameItem){
		
		game = new LabConnectFourGameEXAMPLE(10);   
		
		gameItem = pgameItem;
		quitItem = pquitItem;
		selection = new JButton[SIZE];
		
		/*
		 *    TODO 1:  
		 *    		From this point on... replace all size to .length 	
		 */
		
		setLayout(new GridLayout(SIZE+1,SIZE));  // room for top row
		
		/*
		 *    TODO 2:  
		 *    		Find online 3 different images (*.jpg) to represent a blank, player1 and player 2 
		 *    		Create 3 files and save them in the project folder 
		 *         Replace the nulls below with "new ImageIcon ("player2.png")" for example;	
		 */
		iconBlank = null;
		iconPlayer1 = null;
		iconPlayer2 = null; 
		
		ButtonListener listener = new ButtonListener();
		quitItem.addActionListener(listener);
		gameItem.addActionListener(listener);       
		
		
		for (int col = 0; col < SIZE; col++) {
			selection[col] = new JButton ("Select");
			selection[col].addActionListener(listener);
			add(selection[col]);
		}
		
		matrix = new JLabel[SIZE][SIZE];
		
		for (int row = 0; row < SIZE; row++) {
			for (int col = 0; col < SIZE; col++) {
				matrix[row][col] = new JLabel("",iconBlank,SwingConstants.CENTER);
				add(matrix[row][col]);					
			}
		}
	}
	
	
	
	//*****************************************************************
	//  Represents a listener for button push (action) events.
	//*****************************************************************
	private class ButtonListener implements ActionListener
	{
		//--------------------------------------------------------------
		//  Updates the counter and label when the button is pushed.
		//--------------------------------------------------------------
		public void actionPerformed (ActionEvent event)
		{
			
			JComponent comp = (JComponent) event.getSource();
			
			for (int col = 0; col < SIZE; col++) {
				if (selection[col] == comp) {
					
					int row = game.selectCol(col);
					if (row == -1)
						JOptionPane.showMessageDialog(null, "Col is full!");
					else 
						/*
						 *    TODO 2:  (continued)  
						 *    		This line below will need to be replace so an Icon can appear. 
						 */
						matrix[row][col].setText("" +game.getCurrentPlayer());
					
					if (game.isWinner()) {
						JOptionPane.showMessageDialog(null, "Player" + game.getCurrentPlayer() + " Wins!");
						}
					
					game.nextPlayer();
					}
			}
			 
			if (comp == gameItem) {    
				game.reset();
				
				for (int row = 1; row < SIZE; row++) 
					for (int col = 0; col < SIZE; col++) 
						matrix[row][col].setIcon( iconBlank);
			}
			
			if (comp == quitItem)
				System.exit(1);
		}
		
	}
	
}
