package chapter4;

public class Student {

	private String name;
	private int age;
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public String getName() {
//		return this.name;
//	}
//
//	public int getAge() {
//		return this.age;
//	}
//
//	public void setName(String name1) {
//		this.name = name1;
//
//	}

}
