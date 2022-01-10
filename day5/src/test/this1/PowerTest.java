package test.this1;

public class PowerTest {
	private int n;
	
	public void power(int n) {
		this.n = n*n;
		System.out.printf("%dÀÇ 2Á¦°ö±àÀº %dÀÔ´Ï´Ù, \n", n, this.n);
	}
	public int power(int x,int y) {
		n=1;
		for(int i=0; i<y; i++) {
			n*=x;
		}
		return 0;
	}
}
