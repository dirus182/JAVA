package chapter7;

class Animal {
	void eat() {
		System.out.println("animal is eating...");
	}
}

class Dog extends Animal {
//	void eat() {
//		System.out.println("dog is eating");
//	}
}

class BabyDog1 extends Dog {

}

public class Video47 {
	public static void main(String[] args) {
		System.out.println("run video 47");
		Animal a = new BabyDog1();
		a.eat();
	}

}
