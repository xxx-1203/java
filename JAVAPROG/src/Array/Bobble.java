package Array;

import java.util.Scanner;
public class Bobble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int data[]=new int[] {3, 4, 1, 5, 2};
				
		System.out.print("원본데이타 :");
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+" ");
		
		System.out.println();
		
		for(int i=data.length-2; i>=0; i--) {
			for(int j=0; j<=i; j++)
				if(data[j] > data[j+1]) {
					int temp=data[j];
					data[j]=data[j+1];
					data[j+1]=temp;
				}
		}
		System.out.print("정렬결과 :");
				
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+" ");
	}

}
