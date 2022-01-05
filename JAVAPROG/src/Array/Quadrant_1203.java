//1203 김선혜
package Array;

import java.util.Scanner;
public class Quadrant_1203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j=1;
		double x=0, y=0;
		
		//입력
		while(j>0) {
			System.out.println("**************************************");
			System.out.print("점의 좌표(x, y) 입력 : ");
			x = scan.nextDouble();
			y = scan.nextDouble();
			if(x>0 && y>0) System.out.println("(" + x +", " + y + ")의 위치 : 1사분면");
			if(x<0 && y>0) System.out.println("(" + x +", " + y + ")의 위치 : 2사분면");
			if(x<0 && y<0) System.out.println("(" + x +", " + y + ")의 위치 : 3사분면");
			if(x>0 && y<0) System.out.println("(" + x +", " + y + ")의 위치 : 4사분면");
			if(x == 0 || y == 0) System.out.println("("+x+", "+y+")의 위치 : 선 위에 위치");
			else if(x == 0 && y == 0) {
				System.out.println("*****************End******************");
				break;
				
			}
		}
		
		//계산

	}

}
