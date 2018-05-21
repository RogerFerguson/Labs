package LabExam;
import java.io.*;
import java.util.*;

public class LabExam {
	private ArrayList<Student> list;

	public LabExam () {
		list = new ArrayList<Student>();

		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		int total = scanner.nextInt();
		for (int i = 0; i < total; i++) {
			String name = scanner.next();
			double gpa = scanner.nextDouble();	
			list.add(new Student(name, gpa));
		}		
	}

	public static void main (String[] args) {
		(new LabExam()).exam();   // this will avoid a static method problem
	}
	

	public void  exam() {
		Collections.sort(list);
		System.out.println("Sorted by GPA: " + list + "\n");
		Collections.sort(list, (s1, s2) -> s1.getName().compareTo(s2.getName()));
		System.out.println("Sorted by Names: " + list + "\n");
	}

}

/*
  Sorted by GPA: [
Name : Roger GPA: 1.0, 
Name : Scott GPA: 2.0, 
Name : Ginger GPA: 2.5, 
Name : Gregg GPA: 3.0, 
Name : Cathy GPA: 4.0]

Sorted by Names: [
Name : Cathy GPA: 4.0, 
Name : Ginger GPA: 2.5, 
Name : Gregg GPA: 3.0, 
Name : Roger GPA: 1.0, 
Name : Scott GPA: 2.0]

*/
 

