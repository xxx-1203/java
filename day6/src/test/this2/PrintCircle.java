package test.this2;

public class PrintCircle {
	
	public static void print(circle c) {
		System.out.printf("������ %dcm�� ���� �ѷ��� %.2c(cm2)�̴�.\n", c.getR(),c.getCircum());
		System.out.printf("������ %dcm�� ���� ������ %.2c(cm2)�̴�.\n", c.getR(),c.getArea());
	}
	public static void main(String[] args) {
		circle c=new circle(7);
		c.showInfo();
		
		circle c2=new circle(7);
		c.showInfo();
	}
}
