//1203 김선혜
package Array;

public class Number_1203 {

	public static void main(String[] args) {
		int max=0,min=31,ge=0,gesu=0,su;
		int[] count=new int[51];
		//랜덤
		for(int i=1; i<=50; i++) {
			su=(int)(Math.random()*30+1);
			count[su]++;
			System.out.print(su+" ");
			if(i%10==0) System.out.println();
			if(max<su)max=su;
			else if(min>su)min=su;
		}
		//출력
		System.out.println();
		System.out.println("최대갑 : "+max+" 최소값 : "+min);
		for (int i=1; i<=50; i++)
			if(count[i]>ge) {
				ge=count[i];
				gesu=i;
			}
		System.out.println("가장 빈도수가 높은 수는 "+gesu+" 로 "+ge+"번 발생");
	}

}
