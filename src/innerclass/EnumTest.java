package innerclass;

public enum EnumTest {
	MONDAY(5), TUESDAY(10), WEDNESDAY(15), THURSDAY(20), FRIDAY(25), SATURDAY(30), SUNDAY(35);
	int val;
	private EnumTest(int value) {
		this.val=value;
	}
	int getValue() {
		return this.val;
	}
}
