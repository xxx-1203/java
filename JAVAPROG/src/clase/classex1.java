package clase;
//자동자 만들기 (2개의 변수 그리고 맴버메소드2개
class Car{
	
	String 모델명;//맴버변수
	String 제조사;
	void speedup(){System.out.println(모델명+"! 속도를 올려라~!");}//맴버매소드
	void stop(){System.out.println(제조사+"에서 만든 "+모델명+"아~ 멈춰!!");}
	Car(){System.out.println("");}
//	Car(String a, String b) {}
	Car(String name, String made){모델명=name; 제조사=made;}
}
public class classex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car("모닝","현대"); //기본 생성자
		Car sm3 = new Car("SM3","삼성");
		//morning.모델명="모닝";
		//morning.제조사="현대";
		morning.speedup();
		morning.stop();
		//sm3.모델명="Sm3";
		//sm3.제조사="삼성";
		sm3.speedup();
		sm3.stop();
	}

}
