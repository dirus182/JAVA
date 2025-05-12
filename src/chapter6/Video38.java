package chapter6;

import java.util.ArrayList;

public class Video38 {
	public static void main(String[] args) {
		Student st1 = new Student("Hoi dan it", 1);
		Student st2 = new Student("Nguyen van A", 1);
		Student st3 = new Student("Eric Pham", 1);
		Student st4 = new Student("Lakaka", 1);
		Student st5 = new Student("Lukaka", 1);
		ArrayList<Student> arr = new ArrayList();
		arr.add(st5);
		arr.add(st4);
		arr.add(st3);
		arr.add(st2);
		arr.add(st1);
		System.out.println(">> Check arr: " + arr);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Eric")) {
				System.out.println("Start with : " + arr.get(i));

			}
		}
	}

}
