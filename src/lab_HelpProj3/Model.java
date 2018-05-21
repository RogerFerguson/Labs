package lab_HelpProj3;
import java.io.*;
import java.util.ArrayList;

import javax.swing.table.AbstractTableModel;

public class Model extends AbstractTableModel {

		private ArrayList<Book> books;
	
	public Model() {
	
		books = new ArrayList<Book>();
		books.add(new Book(1000, "Book1"));
		books.add(new Dictionary(1000, "Dict1", "French"));
		books.add(new Dictionary(2000, "Dict2", "English"));
	}

	public int getRowCount() {
		return books.size();
	}

	public int getColumnCount() {
		return 3; 
	}
	
	public void add () {
		// TO DO 1: add on two more Books. Call this method from the GUI somehow.
		
		books.add(new Dictionary(1000, "Dict3", "French"));
		books.add(new Dictionary(2000, "Dict4", "English"));
		fireTableRowsInserted(1, 5);
	}

	public Object getValueAt(int row, int col) {
		
	// TO DO 3: Notice the col is not be used, that is, there are 3 columns not 1, 
	//	     change the getColumnCount method to return 3 so you can utilize a JTable 
	//	     more effectively. (This one is hard to do, you may skip and goto TO DO 4
		
//		return "Hi";
		
//		if (books[row] == null)
//			return "";
		
		String temp;
		
		temp = books.get(row).name + " " + books.get(row).pages;
		
//		temp = books[row].name + " " + books[row].pages;
//		if (books[row] instanceof Dictionary) {
//			temp += (" " + ((Dictionary)books[row]).getType());
//		}
			
		return temp;
	}

	public void saveAsSerialized(String filename) {
		// TO DO 4:  save the file Serialized
	}

	public void loadFromSerialized(String filename) {
		// TO DO 5: Load the from Serialized 
	}
}
