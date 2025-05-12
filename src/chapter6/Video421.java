package chapter6;

public class Video421 {
	public static void main(String[] args) {
		System.out.println("Run video 421");
		SinhVienIT st1 = new SinhVienIT("java", "123", "Eric", 10, 0.1);
		System.out.println("st1 check = " + st1.id);
		SinhVienCoKhi st2 = new SinhVienCoKhi("123", "Eric", 10, 0.1, "machine");
		System.out.println("check st2 " + st2.id);
	}
}
