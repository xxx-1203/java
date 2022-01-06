package textclass2;

public class Circle {
	private int r;
	private double circum, area;
	
	public int getr() {
		return r;
	}
	public void setr(int r) {
		this.area=r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	//원의 면적
	public void calcArea() {
		area= Math.PI * Math.pow(r, 2);
	}
	//원의 둘레
	public void calcCrircum() {
		circum =2*Math.PI*r;
	}
}
