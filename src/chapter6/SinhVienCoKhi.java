package chapter6;

public class SinhVienCoKhi extends SinhVien {
	private String skill;

	public SinhVienCoKhi(String id, String name, double price, double tax, String skill) {
		super(id, name, price, tax);
		this.skill = skill;
	}

	@Override
	void tinhDiem() {
		// TODO Auto-generated method stub

	}

}
