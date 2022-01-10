package test.static1;

public class RunTV {

	public static void main(String[] args) {
		TV t1 = new TV(32, "Blue");
		TV t2 = new TV(55, "Red");
		TV t3 = new Tv(100, "Green");
	}
	t1.producer = "LG전자";
	
	System.out.printf("t1이 참조하는 TV 객체의 맴버필드 color: %s, size: %d, producer: %s\n", t1.getColor(), t1.getSize(), t1.producer);
	System.out.printf("t2이 참조하는 TV 객체의 맴버필드 color: %s, size: %d, producer: %s\n", t2.getColor(), t2.getSize(), t2.producer);
	System.out.printf("t3이 참조하는 TV 객체의 맴버필드 color: %s, size: %d, producer: %s\n", t3.getColor(), t3.getSize(), t3.producer);
}
