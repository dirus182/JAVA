package tuandat;

import java.util.Scanner;

public class Lab01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int diem;
		diem = scanner.nextInt();
		System.out.println("Eric co diem bang " + diem);
		scanner.close(); // Đóng scanner để tránh rò rỉ bộ nhớ
	}
}
