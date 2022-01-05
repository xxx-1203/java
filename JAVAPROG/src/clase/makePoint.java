package clase;
import java.util.Scanner;
class dot{
	double x;
	double y;
	
	dot(double x, double y){
		this.x=x;
		this.y=y;
	}
	void move_pot(double mx, double my){
		x+=mx;
		y+=my;
	}
	void print() {
		System.out.println("현재 점의 위치 : ("+x+", "+y+")");
	}
}
public class makePoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("좌표 입력( x, y ) : ");
		dot z1=new dot(sc.nextDouble(), sc.nextDouble());
		z1.print();
		System.out.print("이동할 좌표 입력( x, y) : ");
		z1.move_pot(sc.nextDouble(), sc.nextDouble());
		System.out.println("이동한 ");
		z1.print();
	}

}
