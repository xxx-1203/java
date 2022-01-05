package Array;

public class ForEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int[] a=new int[100];
		for (int i=0; i<a.length; i++) {
			a[i]=i+1;
			sum +=a[i];
		}
		System.out.print(sum);
	}

}
