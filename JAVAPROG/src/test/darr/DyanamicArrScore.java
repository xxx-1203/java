package test.darr;

import java.util.Scanner;
public class DyanamicArrScore {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);//���� �Է¹޴� ��ĳ��(String)
		Scanner s2 = new Scanner(System.in);//�л���, �����, ���������� ������ �Է� �޴� ��ĳ��(int)
		
		System.out.println("===== ���� �迭�� ����� ���� ���α׷� =====\n");
		
		System.out.print("* �л��� �Է�: ");
		int stuNum = s2.nextInt();
		
		//������ �����ϴ� �迭(1���� �迭)
		String[] stuNames = new String[stuNum];
		//�� �л��� ������ �����ϴ� �迭(���� 2�����迭)
		int[][]scores = new int[stuNum][];
		//�� �л��� �հ踦 �����ϴ� �迭(1���� �迭)
		int[] sums = new int[stuNum];
		
		
		//��(�л��� ��ŭ)�� ���� for
		for (int i = 0; i<scores.length; i++ ) {
			System.out.print("* �л��̸� �Է� :");
			stuNames[i] = s1.nextLine();
			System.out.print("���� �� �Է� : ");
			int subNum = s2.nextInt();
			scores[i] = new int[subNum];
		//��(����� ��ŭ)�� ����for
		for (int j=0; j<scores[i].length; j++) {
			System.out.print("->"+(j+1)+" ���� ���� �Է�: ");
			scores[i][j] = s2.nextInt();
			sums[i] += scores[i][j];
			}
		}
		//��� ���
		for (int i=0; i<scores.length; i++) {
			System.out.print((i+1)+"."+stuNames[i]+" ");
			for (int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+" ");
			}
			System.out.println("�հ� : "+sums[i]+"");
		}
		System.out.println("=======================================\n");
	}

}
