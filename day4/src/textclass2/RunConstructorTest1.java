package textclass2;

public class RunConstructorTest1 {

	public static void main(String[] args) {
		ConstructorTest1 c1 = new ConstructorTest1(7);
		ConstructorTest1 c2 = new ConstructorTest1(11);

		System.out.println("c1�� �����ϴ� ��ü�� n1 �ʵ��� ���� "+c1.getN1());
		System.out.println("c2�� �����ϴ� ��ü�� n1 �ʵ��� ���� "+c2.getN1());
	}

}
