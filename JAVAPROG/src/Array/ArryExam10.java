package Array;

public class ArryExam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][]a= {{1,2,3},{10,20,30}};
		int[][] a=new int[2][3];
		
		for(int i=0; i<a.length; i++)
			for(int j=0; j<a[i].length; j++)
				System.out.print(a[i][j]+"\t");
	}

}
