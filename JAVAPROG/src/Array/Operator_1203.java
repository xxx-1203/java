//1203 김선혜
package Array;

import java.util.Scanner;
public class Operator_1203 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		System.out.println("--------------------------------------------");
		System.out.print("연산자(+, -, *, /) 입력 : ");
		String jj= scan.next(); String scanner;
		
		System.out.print("첫번째 수 입력 : ");
		int su = scan.nextInt();
	
		System.out.print("두번째 수 입력 : ");
		int su2=scan.nextInt();
		int sum;
		System.out.print(su+jj+su2);
	}

}
