package innerclass;

public enum EnumStringTest {
	VOID("Void"), PENDING("Pending");

	private String value;
	private EnumStringTest(String value1) {
		// TODO Auto-generated constructor stub
		this.value=value1;
	}
	public String getValue() {
		return value;
	}
}
