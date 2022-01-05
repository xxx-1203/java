package test.darr;

import java.util.Scanner;
public class DyanamicArrScore {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);//성명 입력받는 스캐너(String)
		Scanner s2 = new Scanner(System.in);//학생수, 과목수, 성적과같은 정수를 입력 받는 스캐너(int)
		
		System.out.println("===== 동적 배열을 사용한 성적 프로그램 =====\n");
		
		System.out.print("* 학생수 입력: ");
		int stuNum = s2.nextInt();
		
		//성명을 지정하는 배열(1차원 배열)
		String[] stuNames = new String[stuNum];
		//각 학생의 성적을 저장하는 배열(동적 2차원배열)
		int[][]scores = new int[stuNum][];
		//각 학생의 합계를 저장하는 배열(1차원 배열)
		int[] sums = new int[stuNum];
		
		
		//행(학생수 만큼)에 대한 for
		for (int i = 0; i<scores.length; i++ ) {
			System.out.print("* 학생이름 입력 :");
			stuNames[i] = s1.nextLine();
			System.out.print("과목 수 입력 : ");
			int subNum = s2.nextInt();
			scores[i] = new int[subNum];
		//열(과목수 만큼)에 대한for
		for (int j=0; j<scores[i].length; j++) {
			System.out.print("->"+(j+1)+" 과목 점수 입력: ");
			scores[i][j] = s2.nextInt();
			sums[i] += scores[i][j];
			}
		}
		//결과 출력
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"."+stuNames[i]+" ");
			for (int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println("합계 : "+sums[i]+"");
		}
		System.out.println("=======================================\n");
	}

}
