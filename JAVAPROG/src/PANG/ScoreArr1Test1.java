package PANG;

public class ScoreArr1Test1{

	public static void main(String[] args) {
		// 1���� �迭 ��ü�� �ʱ�ȭ ��Ų��
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
		
		System.out.println("* �հ�: "+sum);
		System.out.println("* ���: "+avg);
	}

}
