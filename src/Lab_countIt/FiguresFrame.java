package Lab_countIt;

import java.awt.GridLayout;
import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FiguresFrame extends JFrame{ 
	private static final long serialVersionUID = 1L;
	private JPanel[] figuresPanel;
	private DecimalFormat formatter;
	private List<JLabel> labelList;
	private List<BigInteger> iterationList;
	
	public FiguresFrame() {
		figuresPanel = new JPanel[4];
		for (int i = 0; i < 4; i++)
			figuresPanel[i] = new JPanel();
		
		formatter = new DecimalFormat("0.######E0");
		labelList = new ArrayList<JLabel>();
		iterationList = new ArrayList<BigInteger>();
		setSize(1800, 900);
		setVisible(true);
		
		for (int i = 0; i < 4; i++)
			getContentPane().add(figuresPanel[i]);
		
		setLayout(new GridLayout(1, 4));
		
		iterationList.add(BigInteger.valueOf(1));
		iterationList.add(BigInteger.valueOf(1));
		iterationList.add(BigInteger.valueOf(3));
		iterationList.add(BigInteger.valueOf(5));
		iterationList.add(BigInteger.valueOf(9));
		
		for (int i = 0; i < 4; i++)
			figuresPanel[i].setLayout(new GridLayout(50, 1));
		figuresPanel[0].setLayout(new GridLayout(51, 1));
		for (int i = 5; i < 201; i++) {
			iterationList.add(iterationList.get(i-1).add((iterationList.get(i-2).subtract(iterationList.get(i-3))).add(iterationList.get(i-1).subtract(iterationList.get(i-2)))));
		}
		
		for (int i = 0; i < 51; i++) {
			addNumbersToList(i+1, iterationList.get(i), 0);
//			System.out.println(iterationList.get(i));
		}
		
		for (int i = 51; i < 101; i++) {
			addNumbersToList(i+1, iterationList.get(i), 1);
		}
		
		for (int i = 101; i < 151; i++) {
			addNumbersToList(i+1, iterationList.get(i), 2);
		}
		
		for (int i = 151; i < 200; i++) {
			addNumbersToList(i+1, iterationList.get(i), 3);
		}
	}
	
	public void addNumbersToList(long value, BigInteger iterationCount, int panelNumber) {
		labelList.add(new JLabel());
		figuresPanel[panelNumber].add(labelList.get(labelList.size() - 1));
		labelList.get((int) (value - 1)).setText(value + ": " + formatter.format(iterationCount));
		labelList.get((int) (value - 1)).paintImmediately(labelList.get((int)value - 1).getVisibleRect());
		figuresPanel[panelNumber].paintImmediately(figuresPanel[panelNumber].getVisibleRect());
		figuresPanel[panelNumber].validate();
		figuresPanel[panelNumber].repaint();
		revalidate();
	}

	public static void main(String[] args) {
		new FiguresFrame();
	}
}

