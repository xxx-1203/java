package clase;
import java.util.Scanner;
class square{
	int cm1;
	int cm2;
	int cm3;
	int cm4;
	int idNum;
	static int Sqid=0;
	int cm(){return cm1+cm2+cm3+cm4;}
	double area() {return (double)cm1*cm2;	}
	square(int a, int b, int c, int d){cm1=a; cm2=b; cm3=c; cm4=d;}
	void print() {System.out.println("���̰� "+cm1+", "+cm2+", "+cm3+", "+cm4+"�̸� ���̴� "+area()+"�̰� �ѷ��� "+cm());}
	public square() {//Ŭ������ ������ �̸��� �������Լ�
		idNum=Sqid++;
		//
	}
}
public class Square_Test {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		square sq1=new square((int)(Math.random()*10)+1,(int)(Math.random()*10)+1,(int)(Math.random()*10)+1,(int)(Math.random()*10)+1);
		sq1.print();
		square sq2=new square((int)(Math.random()*10)+1,(int)(Math.random()*10)+1,(int)(Math.random()*10)+1,(int)(Math.random()*10)+1);
		sq2.print();
		System.out.println(square.Sqid);
	}

}
