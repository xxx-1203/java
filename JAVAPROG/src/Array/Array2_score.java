package Array;

import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//�迭 1,2����, 1,2��for��-�����,��ֱ�, if��(ũ���,���� ����)
		int [][] score = new int[5][3];
		String[] sub_title= {"�ϼ���", "â�Ǽ�", "���ص�"};
		
		for (int i=0; i<score.length; i++) {
			System.out.println((i+1)+"��");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j]=scan.nextInt();
				if(score[i][j]<0 || score[i][j]>20) j--;
			}
		}
		int[] sum=new int[score.length];//5
		//�� ���� �հ���
		for (int i=0; i<score.length; i++) {
			//sum[]=0; �̹� �ʱ�ġ�� 0��
			for(int j=0; j<score[i].length; j++) {
				sum[i]+=score[i][j];
			}
			System.out.println(sum[i]);
		}
		
		//�������
		int[] rank=new int[score.length];
		for (int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(sum[i]<sum[j]) rank[i]++;
				else if(sum[i]>sum[j]) rank[j]++;
			}
			}
		System.out.println("+========================================+");
		System.out.println("��\t�ϼ���\tâ�Ǽ�\t���ص�\t�հ�\t��ŷ");
		System.out.println("==========================================");
		for (int i=0; i<score.length; i++) {
			System.out.print((i+1)+"��"+"\t");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j]+"\t");
			}
			System.out.print(sum[i]+"\t");
			System.out.println(rank[i]+1);
		}
		System.out.println("+========================================+");
		
		int max=0;
		int team=1;
		for(int i=0; i<score.length; i++) {
			//sum=0;
			//for(int j=0; j<score[i].length; j++)
				//sum+=score[i][j];
			if(i==0)
				max=sum[i];
			else if(sum[i]>max) {
				max=sum[i];
				team=i+1;
			}
		}
		System.out.print(team+"��, ����: "+max);
	}

}
