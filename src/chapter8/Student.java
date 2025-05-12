package chapter8;

public class Student extends Person {
	private int mark;
	private String grade;

	public Student(String id, String name, int age, int mark) {
		super(id, name, age);
		this.mark = mark;
		// TODO Auto-generated constructor stub
	}

	public int getMark() {
		return mark;
	}

	public String getGrade() {
		return grade;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	@Override
	public String toString() {
		return "Student [mark=" + mark + ", grade=" + grade + "]";
	}

	public String setGrade() {
		if (this.mark >= 8)
			return this.grade = "A";
		if (this.mark >= 7 && this.mark < 8)
			return this.grade = "B";
		if (this.mark >= 6)
			return this.grade = "C";
		if (this.mark >= 5)
			return this.grade = "D";
		if (this.mark < 5)
			return this.grade = "Tach cmnr";
		return grade;
	}

}
