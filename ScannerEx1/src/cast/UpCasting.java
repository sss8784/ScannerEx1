package cast;
	/*
	 *  date: 2015.07.07
	 *  Author : me
	 *  @ stroy : ��ĳ���ù���
	 */
public class UpCasting {
	public static void main(String[] args) {
		/*
		 upcasting(��ĳ����)
		 - ��ȯ(conversion)
		 - ������ �ڵ���ȯ
		 - ������ Ÿ���� ����� �� ������ ������
		 - ũ�Ⱑ ���� ������ Ÿ���� �������� ũ�Ⱑ ū ������Ÿ���� �������� �Ҵ��Ҷ�
	
		 */
		int a = 3;
		double b = 3.14D;
		b = a; //64bit������Ÿ���� 32bit ������ Ÿ����  �ݴ� ���
		  //�̸� ���ɽ����̶���Ѵ�.
		System.out.println("��ĳ���� ��� "+b);
	}


}
