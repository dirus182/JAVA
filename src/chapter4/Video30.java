package chapter4;

public class Video30 {
	public static void main(String[] args) {
		Product test = new Product();

		Product pr1 = test.nhapThongtin("computer", 200, 10);
		test.xuatThongtin(pr1);
		System.out.println("tax = " + test.getTaxPrice(pr1.getPrice(), pr1.getTax()));
	}
}
