package textclass2;

public class RunCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		
		c1.setr(7);
		c2.setr(25);
		
		c1.calcCrircum();
		c1.calcArea();
		
		System.out.printf("�������� %dcm�� ���� �ѷ��� %.3fcm\n", c1.getr(), c1.getCircum());
		System.out.printf("�������� %dcm�� ���� ������ %.3fcm\n", c1.getr(), c1.getArea());
		
		c2.calcCrircum();
		c2.calcArea();
		
		System.out.printf("�������� %dcm�� ���� �ѷ��� %.3fcm\n", c2.getr(), c2.getCircum());
		System.out.printf("�������� %dcm�� ���� ������ %.3fcm\n", c2.getr(), c2.getArea());
	}

}
