package test.this3;

public class ThisTest {
	public ThisTest() {
		this(70);
		System.out.println("ThisTest() �����ڰ� ȣ���. ");
	}
	public ThisTest(int n) {
		System.out.println("public ThisTest(int n) �����ڰ� ȣ��� :"+n);
	}
	public static void main(String[] arg) {
		ThisTest tt = new ThisTest();
	}
}
