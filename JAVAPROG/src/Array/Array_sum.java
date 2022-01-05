package Array;

public class Array_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag=-1;
		int sum=0;
		int[] a=new int[100];
		for (int i=0; i<a.length; i++) {
			a[i]=i+1;
			flag*=-1;		
			sum +=(a[i]*flag);
		}
		System.out.print(sum);
				
	}
}
