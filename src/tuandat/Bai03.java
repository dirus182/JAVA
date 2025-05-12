package tuandat;

import java.util.Scanner;

public class Bai03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		switch (number) {
		case (1):
			System.out.println("Cong");
			break;
		case (2):
			System.out.println("Tru");
			break;
		case (3):
			System.out.println("Ket Thuc");
			break;
		default:
			System.out.print("wrong input");
			break;
		}
		scanner.close();
	}
}
