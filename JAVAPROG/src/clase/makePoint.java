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
		System.out.println("���� ���� ��ġ : ("+x+", "+y+")");
	}
}
public class makePoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("��ǥ �Է�( x, y ) : ");
		dot z1=new dot(sc.nextDouble(), sc.nextDouble());
		z1.print();
		System.out.print("�̵��� ��ǥ �Է�( x, y) : ");
		z1.move_pot(sc.nextDouble(), sc.nextDouble());
		System.out.println("�̵��� ");
		z1.print();
	}

}
