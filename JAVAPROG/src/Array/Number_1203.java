//1203 �輱��
package Array;

public class Number_1203 {

	public static void main(String[] args) {
		int max=0,min=31,ge=0,gesu=0,su;
		int[] count=new int[51];
		//����
		for(int i=1; i<=50; i++) {
			su=(int)(Math.random()*30+1);
			count[su]++;
			System.out.print(su+" ");
			if(i%10==0) System.out.println();
			if(max<su)max=su;
			else if(min>su)min=su;
		}
		//���
		System.out.println();
		System.out.println("�ִ방 : "+max+" �ּҰ� : "+min);
		for (int i=1; i<=50; i++)
			if(count[i]>ge) {
				ge=count[i];
				gesu=i;
			}
		System.out.println("���� �󵵼��� ���� ���� "+gesu+" �� "+ge+"�� �߻�");
	}

}
