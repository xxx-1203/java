package clase;
class Test{
	void show(String str) {//클래스가 분리된 메서드이므로 static을 넣지 않는다.
		System.out.println("메게변수가 전달됨 : "+str);
		}
	void show() {
		System.out.println("동리한 이름의 매서드가 있어도 오류가 아닙니다. 매개변수가 다른 오버라이딩 된 매서드입니다.");
		}
	}
public class OverLodingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1=new Test();
		t1.show();
		t1.show("mirim");

	}

}
