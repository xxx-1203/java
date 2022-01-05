package clase;
//상자의 부피를 구하는 것(변수3개를 랜덤으로 지정)
class fox{
	int width;
	int height;
	int depth;
}
public class box_count {

	public static void main(String[] args) {
		int my_count1=100;
		int my_count2=my_count1;
		fox mybox1=new fox();
		mybox1.width=10;
		mybox1.height=20;
		mybox1.depth=30;
		System.out.println("mybox1 width: "+mybox1.width+" height: "+mybox1.height+" depth: "+mybox1.depth);
		fox mybox2=mybox1;

	}

}
