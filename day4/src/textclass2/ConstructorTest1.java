package textclass2;

public class ConstructorTest1 {
	private int n1;
	
	public int getN1() {
		return n1;
	}
	
	public void setN1(int n1) {
		this.n1 = n1;
	}
	public ConstructorTest1(int n1) {
		this.n1 = n1;
		System.out.printf("ConstructorTest1(%d) 생성자 호출됨.\n", n1);
	}
}
