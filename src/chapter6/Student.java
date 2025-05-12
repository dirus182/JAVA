package chapter6;

public class Student {

	private String name;
	private int age;

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student() {

	}

	public Student(String name1, int age1) {
		this.name = name1;
		this.age = age1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
