package clase;
class A{
	String name="class A";
	void show() {System.out.println("이름 : "+name);}
}
class B extends A{
	void show() {
		System.out.println("이 예제는 상속관계에 있는 클래스간의 매서드 오버라이딩에 대한 예재입니다.");
		System.out.println("이름은 출력될가요? "+name);
	}
}
public class OverRidingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		a.show();
		b.show();
	}

}
