package cast;
/*
 *  date: 2015.07.07
 *  Author : me
 *  @ story : �ٿ�ĳ���ù���
 */
public class DownCasting {
	public static void main(String[] args) {
		/*
		 DownCasting(�ٿ�ĳ����)
		 - ���� ����ȯ
		 - ���α׷����� ������ Ÿ���� ū ����(64bit)��
		 ������ Ÿ���� ���� ����(32��Ʈ)��
		 �Ҵ��Ϸ��� �Ҷ� �����(int)���� Ÿ���� �����ϴ°�
		 - �ٸ� �������� �ս��� �߻���
		 - �����ڴ� ���� �ٿ�ĳ������ �Ϸ��� �������� ��Ŭ������ ���� �ڵ����� add cast�Ѵ�.
		 */
		int a = 7;
		double d = 3.14D;
	   a = (int) d;
	   System.out.println("�ٿ�ĳ���� ��� "+a);
	}
	

}
