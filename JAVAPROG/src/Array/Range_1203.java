//1203 �輱��
package Array;

import java.util.Scanner;
public class Range_1203 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int j=1, cnt=0, sum=0;
		int[] su2=new int [100];
		//�Է�
		while (j>0) {
			System.out.print("�� �Է� : ");
			int su = scan.nextInt();
			if (10<=su && su<=30) {
				su2[cnt++]=su; //0 1 2 3 
				sum+=su;
			}
			if (su==0) break;
		}
		
		//���
		System.out.print("10 ~ 30 ������ �� : ");
		for (int i=0; i<cnt; i++) { 
			System.out.print(su2[i]+" ");
		}
		System.out.println();
		
		System.out.print("���� : "+sum);
	}
}
