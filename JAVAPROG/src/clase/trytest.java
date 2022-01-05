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
		System.out.println("너비가 "+width+"이고 "+"길이가 "+height+"이고 "+"넓이가 "+area()+"인"+"삼각형");
	}
}
public class trytest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		trys t1=new trys((int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
		/*System.out.print("너비 입력 : ");
		t1.width=sc.nextInt();
		System.out.print("높이 입력 : ");
		t1.height=sc.nextInt();
		t1.area();
		t2.area();*/
		t1.print();
		//System.out.println("너비가 "+t1.width+"고 높이가 "+t1.height+"인 삼각형의 넓이 "+t1.area());//랜덤
	    //System.out.println("넓이 : "+t1.area());
		trys t2=new trys((int)(Math.random()*10)+1,(int)(Math.random()*10)+1);
		t2.print();


		
	}


}
