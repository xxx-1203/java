package PANG;

public class Arr2Test1 {

	public static void main(String[] args) {
		// 3�� 4���� 2�����迭�� �ʱ�ȭ���Ѽ� �迭��ü ����� ����
		String[][] favs1 = {{"ȣ����", "������", "�䳢", "����"}, {"���", "�ٳ���", "��", "Ű��"},
							{"��", "����", "����", "�ܿ�"}};
		for(int i=0; i<favs1.length; i++) {
			for(int j=0; j<favs1[i].length; j++) {
				System.out.print(favs1[i][j]+" ");
			}
			System.out.println();
		}

	}

}
