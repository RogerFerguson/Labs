package LabExam;

public class Student implements Comparable<Student> {
	private String name;
	private double gpa;

	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGPA() {
		return gpa;
	}
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}

	public String toString () {
		return "\nName : " + name + " GPA: " + gpa;
	}

	@Override
	public int compareTo(Student student) {
		
		//return (int) (this.gpa - student.gpa);   Does not work well, truncate problem
		if (this.gpa > student.gpa)
			return 1;
		else if (this.gpa < student.gpa)
			return -1;
		else 
			return 0;
	}


}
