package test.constructor2;

public class USBMemory {
	private int capacity;
	private String color;
	public int getCapacity() {
		return capacity;
	}
	public String getColor() {
		return color;
	}
	public USBMemory(int capacity, String color) {
		this.capacity = capacity;
		this.color = color;
	}
	public String showInfo() {
		return capacity+"GB, "+color+"����";
	}
	public void writeMemory() {
		System.out.println(showInfo()+"�� USB Memory�� �����͸� �����Ѵ�. ");
	}
	public void readMemory() {
		System.out.println(showInfo()+"�� USB Memory�� �����͸� �о�´�. ");
	}
}
