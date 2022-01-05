package Array;
import java.util.Scanner;
public class merge {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[10];
		int x,y,z;
		x=y=z=0;
		System.out.print("1번방");
		for(int i=0; i<=4; i++) {
			a[i]=scan.nextInt();
		}
		System.out.print("2번방");
		for(int i=0; i<=4; i++) {
			b[i]=scan.nextInt();
		}
		//정렬
		Bobble_sort(a);
		
		Bobble_sort(b);
		//병합
		while(true) {
			if(a[x]<b[y]) {
				c[z]=a[x];
				x++;
				z++;
			}
			else if(a[x]>b[y]) {
				c[z]=b[y];
				y++;
				z++;
			}
			else if(a[x]==b[y]) {
				c[z]=a[x];
				x++;
				y++;
				z++;
			}
			
			if(x==a.length || y==b.length)
			break;
		}
		if (x==5) {		
			for(int i=y; i<b.length; i++) {
				c[z]=b[i];
				z++;
			}
		}
				
		else if (y==5) {		
			for(int i=x; i<b.length; i++) {
				c[z]=b[i];
				z++;
			}
		}
		for(int i=0; i<=9; i++) {
			if(c[i]!=0) System.out.print(c[i]+" ");
		}
	}
	static void Bobble_sort(int[] arr){
		for(int i=arr.length-2; i>=0; i--) {
			for(int j=0; j<=i; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
			}		
		}
	}
}
}