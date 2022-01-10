package test.this2;

public class PrintCircle {
	
	public static void print(circle c) {
		System.out.printf("반지름 %dcm인 원의 둘레는 %.2c(cm2)이다.\n", c.getR(),c.getCircum());
		System.out.printf("반지름 %dcm인 원의 면적은 %.2c(cm2)이다.\n", c.getR(),c.getArea());
	}
	public static void main(String[] args) {
		circle c=new circle(7);
		c.showInfo();
		
		circle c2=new circle(7);
		c.showInfo();
	}
}
