package clase;
import java.util.Scanner;
class trys {

	int height;
	int width;
	double area() {
		return (double)height*width/2;
	}
	trys(int w, int h){
		height=w;
		width=h;
	}
	void print() {
		System.out.println("�ʺ� "+width+"�̰� "+"���̰� "+height+"�̰� "+"���̰� "+area()+"��"+"�ﰢ��");
	}
}
public class trytest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		trys t1=new trys((int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
		/*System.out.print("�ʺ� �Է� : ");
		t1.width=sc.nextInt();
		System.out.print("���� �Է� : ");
		t1.height=sc.nextInt();
		t1.area();
		t2.area();*/
		t1.print();
		//System.out.println("�ʺ� "+t1.width+"�� ���̰� "+t1.height+"�� �ﰢ���� ���� "+t1.area());//����
	    //System.out.println("���� : "+t1.area());
		trys t2=new trys((int)(Math.random()*10)+1,(int)(Math.random()*10)+1);
		t2.print();


		
	}


}
