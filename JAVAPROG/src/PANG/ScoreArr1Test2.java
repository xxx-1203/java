package PANG;
import java.util.Scanner;
public class ScoreArr1Test2 {

	public static void main(String[] args) {
		// 1���� �迭�� ���� �װ�ü ����
		int[] scores = new int[5];
		
		//keyboard�� �Է� ���� �ܺ� �����͸� ���α׷����� �������� ���� Scanner ��ü ����
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		double avg = 0;
		
		//���� ������ �Է� �޾Ƽ� �迭�� �����ϰ� �հ赵 ���Ѵ�
		String[] subjects = {"java", "c���", "����", "����", "����"};
		
		for(int i=0; i<scores.length; i++) {
			System.out.print(subjects[i]+"���� ���� �Է�: ");
			scores[i]= s.nextInt();
			sum +=scores[i];
		}
		
		avg = (double)sum / subjects.length;
	}

}
