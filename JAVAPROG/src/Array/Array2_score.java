package Array;

import java.util.Scanner;
public class Array2_score {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//배열 1,2차원, 1,2중for문-방찍기,방넣기, if문(크기비교,개수 한정)
		int [][] score = new int[5][3];
		String[] sub_title= {"완성도", "창의성", "이해도"};
		
		for (int i=0; i<score.length; i++) {
			System.out.println((i+1)+"조");
			for(int j=0; j<score[i].length; j++) {
				System.out.print(sub_title[j]+" : ");
				score[i][j]=scan.nextInt();
				if(score[i][j]<0 || score[i][j]>20) j--;
			}
		}
		int[] sum=new int[score.length];//5
		//각 조의 합계계산
		for (int i=0; i<score.length; i++) {
			//sum[]=0; 이미 초기치가 0임
			for(int j=0; j<score[i].length; j++) {
				sum[i]+=score[i][j];
			}
			System.out.println(sum[i]);
		}
		
		//순위계산
		int[] rank=new int[score.length];
		for (int i=0; i<score.length; i++) {
			for(int j=i+1; j<score.length; j++) {
				if(sum[i]<sum[j]) rank[i]++;
				else if(sum[i]>sum[j]) rank[j]++;
			}
			}
		System.out.println("+========================================+");
		System.out.println("조\t완성도\t창의성\t이해도\t합계\t랭킹");
		System.out.println("==========================================");
		for (int i=0; i<score.length; i++) {
			System.out.print((i+1)+"조"+"\t");
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
		System.out.print(team+"조, 점수: "+max);
	}

}
