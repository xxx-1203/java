package Array;

public class ArrayExam13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a= new int[4][4];
		
		int k=1;
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<=i; j++) {
				a[i][j]=k++;
			}
		}
		
		for (int i=0; i<a.length; i++) {
			for (int j=0; j<=i; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
