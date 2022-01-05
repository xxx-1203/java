package clase;
class Student{
	public String name;//모두 맵버변수의
	int grade;
	int ban;
	int number;
	String telephone;
}
public class ClassExam {

	public static void main(String[] args) {
		Student Kim = new Student();
		Kim.name="김현우";
		Kim.grade=2;
		Kim.ban=3;
		Kim.telephone="123-3456";
		System.out.println("저의 이름은 "+Kim.name+"이고 "+Kim.grade+"학년 "+Kim.ban+"반");
		System.out.println("전화번호는 "+Kim.telephone+"입니다");
	}

}
