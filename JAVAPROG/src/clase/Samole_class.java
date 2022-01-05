package clase;
class Ex_class{
	String car_name;
	private int size;
	void set_size(int size) {
		this.size=size;
	}
	int get_size() {
		return size;
	}
}
public class Samole_class {

	public static void main(String[] args) {
		Ex_class ex = new Ex_class();
		ex.car_name="그랜저";
		ex.set_size(2500);
		System.out.println("차종 :"+ex.car_name+"               크기 :"+ex.get_size());

	}

}
