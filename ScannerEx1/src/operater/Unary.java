package operater;
/*
 *  date: 2015.07.08
 *  Author : me
 *  @ story : ���� �����ڹ���
 */
public class Unary {
	/*
	 * ���׿�����
	 * i++(����������) �Ǵ� ++i(����������)
	 * 
	 */
	public static void main(String[] args) {
		
		int i=5, j=0, x=5, y=0; //���������� ����Ʈ������ �ʱ�ȭ
		
		// �������� �������� �о�� �� �����Ѵ�./
			j = i++;
		System.out.println("j�� ����:\t"+j);
		//�������� x�� ���� ������Ű�� �����Ѵ�
	    //i = i+1;
		y= ++x;
		System.out.println("y�� ����:\t"+y);
	}

}
