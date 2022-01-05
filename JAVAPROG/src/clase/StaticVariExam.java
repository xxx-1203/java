package clase;
class Student_eve{
	String name;
	int grade;
	static int count=0;
	public Student_eve() {
		count++;
	}
}
public class StaticVariExam {

	public static void main(String[] args) {
		Student_eve kim = new Student_eve();
		Student_eve jang = new Student_eve();
		Student_eve bak = new Student_eve();
		System.out.println("생성된 학생 객채의 수는 "+Student_eve.count+"입니다");

	}

}
