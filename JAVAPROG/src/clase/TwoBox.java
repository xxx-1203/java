package clase;
import java.util.Scanner;
class Box{
	int lenght;
	int width;
	int height;
	double volume() {
		return (double)lenght*width*height;
	}
	Box(int l, int w, int h){
		lenght=l;
		width=w;
		height=h;
	}
	void print() {
		System.out.println("길이가 "+lenght+"이고 넓이가 "+width+"이며 높이가 "+height+"인 부피 "+volume()+"인 상자");
	}
}
public class TwoBox {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Box b1=new Box((int)(Math.random()*10)+1, (int)(Math.random()*10)+1, (int)(Math.random()*10)+1);
		b1.print();
	}

}
