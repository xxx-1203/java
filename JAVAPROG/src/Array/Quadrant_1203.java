//1203 �輱��
package Array;

import java.util.Scanner;
public class Quadrant_1203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j=1;
		double x=0, y=0;
		
		//�Է�
		while(j>0) {
			System.out.println("**************************************");
			System.out.print("���� ��ǥ(x, y) �Է� : ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			if(x>0 && y>0) System.out.println("(" + x +", " + y + ")�� ��ġ : 1��и�");
			if(x<0 && y>0) System.out.println("(" + x +", " + y + ")�� ��ġ : 2��и�");
			if(x<0 && y<0) System.out.println("(" + x +", " + y + ")�� ��ġ : 3��и�");
			if(x>0 && y<0) System.out.println("(" + x +", " + y + ")�� ��ġ : 4��и�");
			if(x == 0 || y == 0) System.out.println("("+x+", "+y+")�� ��ġ : �� ���� ��ġ");
			else if(x == 0 && y == 0) {
				System.out.println("*****************End******************");
				break;
				
			}
		}
		
		//���

	}

}
