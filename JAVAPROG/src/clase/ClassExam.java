package clase;
class Student{
	public String name;//��� �ʹ�������
	int grade;
	int ban;
	int number;
	String telephone;
}
public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Kim.name="������";
		Kim.grade=2;
		Kim.ban=3;
		Kim.telephone="123-3456";
		System.out.println("���� �̸��� "+Kim.name+"�̰� "+Kim.grade+"�г� "+Kim.ban+"��");
		System.out.println("��ȭ��ȣ�� "+Kim.telephone+"�Դϴ�");
	}

}
