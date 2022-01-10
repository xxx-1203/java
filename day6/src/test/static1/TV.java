package test.static1;

public class TV {
	public static String producer;
	private int size;
	private String color;
	
	public TV(int size, String color) {
		this.size= size;
		this.color = color;
	}
	public String getColor() {
		return color;
	}
	public int getSize() {
		return size;
	}
}
