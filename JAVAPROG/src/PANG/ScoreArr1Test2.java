package PANG;
import java.util.Scanner;
public class ScoreArr1Test2 {

	public static void main(String[] args) {
		// 1차원 배열의 선언 및객체 생성
		int[] scores = new int[5];
		
		//keyboard로 입력 받은 외부 데이터를 프로그램으로 가져오기 위해 Scanner 객체 생성
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		//과목별 점수를 입력 받아서 배열에 저장하고 합계도 구한다
		String[] subjects = {"java", "c언어", "국어", "영어", "수학"};
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(subjects[i]+"과목 점수 입력: ");
			scores[i]= s.nextInt();
			sum +=scores[i];
		}
		
		avg = (double)sum / subjects.length;
	}

}
