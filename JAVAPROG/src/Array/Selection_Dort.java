package Array;

import java.util.Scanner;
public class Selection_Dort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�迭�� ���̸� �������� : ");
		/*
		int index=scan.nextInt();
		
		int data[]=new int[index];
		*/
		int data[]=new int[45];
		int cnt=0;
		for(int i=0; i<data.length; i++) {
			data[i]=(int)(Math.random()*45)+1;//1~45
			System.out.println();
			for(int j=0; j<i; j++)
				if(data[i]==data[j]) {
					System.out.println(i+" "+j+" "+cnt++);
					i--;
					break;
				}
		}

		/*		
		for(int i=0; i<data.length; i++) {
			System.out.println("���ڸ� �������� : ");
			int su=scan.nextInt();
			data[i]=su;
		}
		
		*/
		
		System.out.println("��������Ÿ :");
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+" ");
		System.out.println();
		
		for(int i=0; i<data.length-1; i++)
			for(int j=i; j<data.length; j++) {
				if(data[i] > data[j]) {
					int temp=data[i];
					data[i]=data[j];
					data[j]=temp;
				}
			}
		System.out.println("���İ�� :");
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+" ");
	}
}