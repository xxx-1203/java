package PANG;

public class ScoreArr1Test1{

	public static void main(String[] args) {
		// 1차원 배열 객체를 초기화 시킨다
		int[] scores = {99,95, 93, 91, 99};
		
		int sum = 0;
		double avg=0;
		
		for (int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		avg = (double)sum / scores.length;
		 
		for(int i=0; i<scores.length; i++) {
			System.out.print(scores[i]+"::");
		}
		System.out.println();
		
		System.out.println("* 합계: "+sum);
		System.out.println("* 평균: "+avg);
	}

}
