package clase;
class Test{
	void show(String str) {//Ŭ������ �и��� �޼����̹Ƿ� static�� ���� �ʴ´�.
		System.out.println("�ްԺ����� ���޵� : "+str);
		}
	void show() {
		System.out.println("������ �̸��� �ż��尡 �־ ������ �ƴմϴ�. �Ű������� �ٸ� �������̵� �� �ż����Դϴ�.");
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
