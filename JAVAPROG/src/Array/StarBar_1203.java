//1203 김선혜
package Array;

import java.util.Scanner;
public class StarBar_1203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1, cnt=0, max=1, min=99;
		System.out.print("점수 입력 : ");
		while (i>0) {
			int su=scan.nextInt();
			if (max<su) max=su;
			if (su<min) min=su;
			cnt++;
			if (su>=0) break;
		}
		int a[] =new int[cnt];
		
		System.out.println("최고점수 : "+max);
		System.out.print("최저점수 : "+min);

	}

}
