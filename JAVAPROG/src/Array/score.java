package Array;

import java.util.Scanner;
public class score {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String subj[]=new String[] {"국어", "영어", "자바", "수학", "C"};
		
		int score[]=new int[subj.length+1]; //6 0~5
		
		int sub_cnt=score.length-1; //과목수 =subj.length
		
		int tot=score[score.length-1]; //총점
		
		for(int i=0; i<sub_cnt; i++) {
			System.out.print(subj[i]+" : ");
			score[i] = scan.nextInt();
			
			while(!(score[i]>=0 && score[i]<=100)) {
				System.out.print(subj[i]+" : ");
				score[i] = scan.nextInt();			}
			
			tot=tot+score[i];
		}
		System.out.print("합계 : "+tot+"\t");

		double f =(double)tot/sub_cnt;
		System.out.print("평균 : "+f+"\t");

		char grade;
		
		switch((int)f/10){
			case 10:
			case 9: grade='A'; break;
			case 8: grade='B'; break;
			case 7: grade='C'; break;
			case 6: grade ='D'; break;
			default: grade = 'E'; break;
			}
		/*
		if(f >= 90) grade='A';
		else if(f >= 80) grade='B';
			else if(f >= 70) grade='C';
				else if(f >= 60) grade='D';
					else grade='E';
		*/
		System.out.println("평점 : "+grade);

	}

}
