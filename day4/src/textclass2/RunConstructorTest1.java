package textclass2;

public class RunConstructorTest1 {

	public static void main(String[] args) {
		ConstructorTest1 c1 = new ConstructorTest1(7);
		ConstructorTest1 c2 = new ConstructorTest1(11);

		System.out.println("c1이 참조하는 객체의 n1 필드의 값은 "+c1.getN1());
		System.out.println("c2이 참조하는 객체의 n1 필드의 값은 "+c2.getN1());
	}

}
