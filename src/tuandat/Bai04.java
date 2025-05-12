package tuandat;

import java.util.Scanner;

public class Bai04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Count electric bill");
		System.out.println("Input you electric operation");
		int a = scanner.nextInt();
		if (a <= 100) {
			int money = a * 1000;
			System.out.println("total electric bill = " + money);
		} else {
			int money = 100 * 1000 + (a - 100) * 1500;
			System.out.println("bill = " + money);
		}
		scanner.close();
	}
}
