package clase;
class Account{
	int ass_num;
	int balense=0;
	void deposit(int money) {
		balense+=money;
	}
	void withdraw(int money) {
		balense-=money;
	}
	public String toString() {
		return "계좌번호: "+ass_num+"\n"+"잔액: "+balense;
	}
	void fixedDeposit(){
		
	}
	static double interst;
	static int bass_num;//클래스 변수(클래스 이름을 붇일 수 있음, 객채 이름도 가능)
}
public class AccountTest {
	public static void main(String[] args) {
		Account ass1=new Account();
		ass1.deposit(5000);
		System.out.println(ass1.toString());
		
		Account ass2=new Account();
		ass2.deposit(3000);
		System.out.println(ass2.toString());
		System.out.println(ass2.ass_num);
		System.out.println(Account.bass_num);
	}

}
