package clase;
//�ڵ��� ����� (2���� ���� �׸��� �ɹ��޼ҵ�2��
class Car{
	
	String �𵨸�;//�ɹ�����
	String ������;
	void speedup(){System.out.println(�𵨸�+"! �ӵ��� �÷���~!");}//�ɹ��żҵ�
	void stop(){System.out.println(������+"���� ���� "+�𵨸�+"��~ ����!!");}
	Car(){System.out.println("");}
//	Car(String a, String b) {}
	Car(String name, String made){�𵨸�=name; ������=made;}
}
public class classex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car morning = new Car("���","����"); //�⺻ ������
		Car sm3 = new Car("SM3","�Ｚ");
		//morning.�𵨸�="���";
		//morning.������="����";
		morning.speedup();
		morning.stop();
		//sm3.�𵨸�="Sm3";
		//sm3.������="�Ｚ";
		sm3.speedup();
		sm3.stop();
	}

}
